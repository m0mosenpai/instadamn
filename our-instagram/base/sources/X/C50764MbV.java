package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.MbV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50764MbV extends ClickableSpan {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C50764MbV(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        FragmentActivity A0C;
        String str;
        switch (this.A00) {
            case 0:
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A02;
                Bundle A0b = AbstractC166987dD.A0b();
                Activity activity = (Activity) this.A01;
                A0b.putString(DialogModule.KEY_TITLE, activity.getResources().getString(2131955256));
                AbstractC25228BEl.A1G(activity, A0b, abstractC12990ll, TransparentModalActivity.class, AbstractC111324zv.A00(801));
                return;
            case 1:
                AbstractC31177DnL.A0u((Context) this.A01, AbstractC166987dD.A0r(((C32302EKp) this.A02).A0B), C2Fb.A1V, "https://help.instagram.com/1695974997209192");
                return;
            case 2:
                C31633Duz c31633Duz = (C31633Duz) this.A02;
                Context context = (Context) this.A01;
                C14360o3.A0A(context);
                IgBloksScreenConfig A0C2 = AbstractC31171DnF.A0C(c31633Duz.A00);
                A0C2.A0R = "com.bloks.www.instagram.partnership_messages.settings";
                A0C2.A0S = "com.bloks.www.instagram.partnership_messages.settings";
                A0C2.A0l = true;
                AbstractC31171DnF.A10(context, A0C2, 2131953779);
                HashMap A1G = AbstractC166987dD.A1G();
                HashMap A1G2 = AbstractC166987dD.A1G();
                HashMap A1G3 = AbstractC166987dD.A1G();
                BitSet bitSet = new BitSet(1);
                A1G.put("entrypoint", "partnerships_inbox");
                bitSet.set(0);
                if (bitSet.nextClearBit(0) >= 1) {
                    C66277U6x A02 = C66277U6x.A02("com.bloks.www.instagram.partnership_messages.settings", AbstractC191768eY.A01(A1G), A1G2);
                    AbstractC31178DnM.A1M(A02, 719983200);
                    A02.A03 = null;
                    A02.A02 = null;
                    A02.A04 = null;
                    A02.A08(A1G3);
                    A02.A04(context, A0C2);
                    return;
                }
                throw AbstractC166987dD.A14("Missing Required Props");
            case 3:
                N7L n7l = (N7L) this.A02;
                String A0g = AbstractC31171DnF.A0g(this.A01);
                InterfaceC09390do interfaceC09390do = n7l.A0G;
                AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
                AbstractC31173DnH.A1I(n7l, AbstractC31171DnF.A0L(n7l.requireActivity(), AbstractC37301Gc2.A04(AbstractC166987dD.A0r(interfaceC09390do), AbstractC31364DqT.A02(), AbstractC31402Dr6.A01(AbstractC166987dD.A0r(interfaceC09390do), A0g, "music_pick_reels_bottom_sheet", n7l.A09)), A0o, ModalActivity.class, "profile"));
                return;
            case 4:
                A0C = AbstractC31172DnG.A0C(this.A02);
                str = ((C51800Mv4) ((InterfaceC58244Pro) this.A01)).A01;
                if (str == null) {
                    throw AbstractC166997dE.A0g();
                }
                break;
            case 5:
                N7M n7m = (N7M) this.A02;
                N7M.A02(n7m, AbstractC31171DnF.A0g(this.A01));
                OUO.A00((OUO) n7m.A0C.getValue(), "attribution_tap", null);
                return;
            default:
                A0C = AbstractC31172DnG.A0C(this.A02);
                str = ((C51800Mv4) this.A01).A01;
                if (str == null) {
                    throw AbstractC166997dE.A0g();
                }
                break;
        }
        AbstractC41776Ies.A03(A0C, str);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.A00) {
            case 1:
                C14360o3.A0B(textPaint, 0);
                Context context = (Context) this.A01;
                AbstractC166987dD.A1N(context, textPaint, AbstractC53242c7.A06(context));
                return;
            case 2:
                C14360o3.A0B(textPaint, 0);
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                C14360o3.A0B(textPaint, 0);
                textPaint.setTypeface(Typeface.DEFAULT_BOLD);
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }
}
