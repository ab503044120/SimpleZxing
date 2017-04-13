package org.huihui.zxingimprove.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.TextView;

public class WifiConnectionFailedDialog extends Dialog
{
  private Context context;
  private Button okBtn;
  private TextView textView;

  public WifiConnectionFailedDialog(Context paramContext)
  {
    super(paramContext, 2131427342);
    this.context = paramContext;
  }

  private void init()
  {
    Display localDisplay = ((Activity)this.context).getWindowManager().getDefaultDisplay();
    LayoutParams localLayoutParams = getWindow().getAttributes();
    localLayoutParams.width = (int)(0.85D * localDisplay.getWidth());
    localLayoutParams.gravity = 17;
    getWindow().setAttributes(localLayoutParams);
  }

  private void setupViews()
  {
    this.textView = ((TextView)findViewById(2131624028));
    this.textView.setText(this.context.getResources().getString(2131493038));
    this.okBtn = ((Button)findViewById(2131624031));
    this.okBtn.setText(this.context.getResources().getString(2131492870));
    this.okBtn.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        WifiConnectionFailedDialog.this.dismiss();
      }
    });
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903113);
    setupViews();
    init();
  }
}

/* Location:           C:\Users\Administrator\Desktop\base_dex2jar.jar
 * Qualified Name:     mobi.thinkchange.android.superqrcode.dialog.WifiConnectionFailedDialog
 * JD-Core Version:    0.6.0
 */