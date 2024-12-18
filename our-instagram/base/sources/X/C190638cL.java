package X;

import android.view.View;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.8cL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190638cL {
    public int A00;
    public boolean A01;
    public final View A02;
    public final UserSession A03;
    public final C190498c7 A04;
    public final IgdsSwitch A05;

    public C190638cL(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(view, 2);
        this.A03 = userSession;
        this.A02 = view;
        this.A04 = new C190498c7(interfaceC11380iw, userSession);
        ((TextView) view.requireViewById(R.id.sticker_setting_toggle_text)).setText(C18U.A06(C06090Tz.A05, userSession, 36321696608888508L) ? 2131966285 : 2131966284);
        IgdsSwitch igdsSwitch = (IgdsSwitch) view.requireViewById(R.id.sticker_setting_toggle);
        this.A05 = igdsSwitch;
        igdsSwitch.A07 = new InterfaceC190658cN() { // from class: X.8cM
            @Override // X.InterfaceC190658cN
            public final boolean onToggle(boolean z) {
                C190638cL c190638cL = C190638cL.this;
                C23031Ai A00 = AbstractC23021Ah.A00(c190638cL.A03);
                A00.A0B.Egi(A00, Boolean.valueOf(z), C23031Ai.A8c[234]);
                c190638cL.A01 = true;
                c190638cL.A04.A00(z, true, c190638cL.A00);
                return true;
            }
        };
        AbstractC010103p.A0B(view, new C02V() { // from class: X.8cO
            @Override // X.C02V
            public final void A0Y(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                C14360o3.A0B(view2, 0);
                C14360o3.A0B(accessibilityNodeInfoCompat, 1);
                super.A0Y(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.removeAction(C012804r.A08);
                accessibilityNodeInfoCompat.setClickable(false);
            }
        });
        view.setClickable(false);
        view.setOnTouchListener(ViewOnTouchListenerC190678cP.A00);
    }

    public final void A00(boolean z, boolean z2) {
        String str;
        this.A05.setChecked(z);
        C23031Ai A00 = AbstractC23021Ah.A00(this.A03);
        A00.A0B.Egi(A00, Boolean.valueOf(z), C23031Ai.A8c[234]);
        this.A01 = z2;
        C190498c7 c190498c7 = this.A04;
        if (z2) {
            C18920wW c18920wW = c190498c7.A00;
            InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "direct_group_story_mention_nux");
            if (A002.isSampled()) {
                if (z) {
                    str = "continue";
                } else {
                    str = "not now";
                }
                A002.AAP("nux_selection", str);
                A002.Cht();
                return;
            }
            return;
        }
        c190498c7.A00(z, false, this.A00);
    }
}
