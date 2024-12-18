package X;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes10.dex */
public abstract class SQL {
    public static boolean A00(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT >= 31 || dragEvent.getLocalState() != null || AbstractC010103p.A0M(view) == null) {
            return false;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity == null) {
                    return false;
                }
                if (dragEvent.getAction() == 1) {
                    return !(view instanceof TextView);
                }
                if (dragEvent.getAction() != 3) {
                    return false;
                }
                if (view instanceof TextView) {
                    TextView textView = (TextView) view;
                    activity.requestDragAndDropPermissions(dragEvent);
                    int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                    textView.beginBatchEdit();
                    try {
                        Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                        AbstractC010103p.A02(textView, new C006002a(dragEvent.getClipData(), 3).A00.AEN());
                        return true;
                    } finally {
                        textView.endBatchEdit();
                    }
                }
                activity.requestDragAndDropPermissions(dragEvent);
                AbstractC010103p.A02(view, new C006002a(dragEvent.getClipData(), 3).A00.AEN());
                return true;
            }
        }
        return false;
    }

    public static boolean A01(TextView textView, int i) {
        ClipData primaryClip;
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 31 || AbstractC010103p.A0M(textView) == null || (i != 16908322 && i != 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            primaryClip = null;
        } else {
            primaryClip = clipboardManager.getPrimaryClip();
        }
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            C006002a c006002a = new C006002a(primaryClip, 1);
            if (i != 16908322) {
                i2 = 1;
            }
            InterfaceC006102b interfaceC006102b = c006002a.A00;
            interfaceC006102b.EUb(i2);
            AbstractC010103p.A02(textView, interfaceC006102b.AEN());
        }
        return true;
    }
}
