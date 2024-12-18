package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.CheckBox;
import com.facebook.R;
import com.instagram.igds.components.imagebutton.IgImageButton;
import java.util.Queue;

/* renamed from: X.HzZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40615HzZ {
    public static final void A00(HKN hkn, InterfaceC154036wC interfaceC154036wC, InterfaceC153826vr interfaceC153826vr, Queue queue, int i) {
        EnumC153476vH enumC153476vH;
        Drawable drawable;
        AbstractC167017dG.A1R(interfaceC153826vr, queue);
        if (interfaceC153826vr.CWN()) {
            CheckBox checkBox = hkn.A00;
            checkBox.setVisibility(0);
            checkBox.setChecked(interfaceC154036wC.Cce());
            boolean Cce = interfaceC154036wC.Cce();
            IgImageButton igImageButton = ((C38160GqR) hkn).A00;
            if (Cce) {
                enumC153476vH = EnumC153476vH.A06;
            } else {
                enumC153476vH = null;
            }
            igImageButton.setMediaOverlay(enumC153476vH);
            igImageButton.setEnableTouchOverlay(false);
            AbstractC13880nE.A0X(checkBox, i);
            Context context = checkBox.getContext();
            if (interfaceC153826vr.Ejk()) {
                Context A03 = AbstractC37301Gc2.A03(hkn);
                if (!interfaceC154036wC.Cce()) {
                    Drawable background = checkBox.getBackground();
                    if (background instanceof C153406vA) {
                        queue.offer(background);
                    }
                    drawable = A03.getDrawable(R.drawable.blue_checkbox_background);
                } else {
                    C153406vA c153406vA = (C153406vA) queue.poll();
                    C153406vA c153406vA2 = c153406vA;
                    if (c153406vA == null) {
                        c153406vA2 = new C153406vA(A03);
                    }
                    c153406vA2.A04 = interfaceC154036wC.Cce();
                    c153406vA2.invalidateSelf();
                    c153406vA2.A00(interfaceC154036wC.Bsu());
                    int i2 = 0;
                    c153406vA2.setBounds(new Rect(0, 0, checkBox.getWidth(), checkBox.getHeight()));
                    if (interfaceC154036wC.isEnabled()) {
                        i2 = AbstractC167007dF.A09(A03, R.attr.igds_color_controls);
                    }
                    c153406vA2.A02 = i2;
                    drawable = c153406vA2;
                }
            } else if (interfaceC154036wC.isEnabled()) {
                drawable = context.getDrawable(R.drawable.blue_checkbox_background);
            } else {
                Drawable drawable2 = context.getDrawable(R.drawable.instagram_circle_check_pano_outline_24);
                C14360o3.A0A(drawable2);
                AbstractC25231BEo.A0x(context, drawable2, AbstractC53242c7.A05(context));
                drawable = drawable2;
            }
            checkBox.setBackground(drawable);
            if (!interfaceC154036wC.isEnabled()) {
                C0fQ.A00(new ViewOnClickListenerC55361OiN(1), igImageButton);
                igImageButton.setOnTouchListener(null);
                return;
            }
            return;
        }
        hkn.A00.setVisibility(8);
        IgImageButton igImageButton2 = ((C38160GqR) hkn).A00;
        igImageButton2.setMediaOverlay(null);
        igImageButton2.setEnableTouchOverlay(true);
    }
}
