package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import java.lang.ref.WeakReference;

/* renamed from: X.6gu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145356gu {
    public C18920wW A00;
    public UserSession A01;
    public InterfaceC1119153d A02;
    public C148076ld A03;
    public C148156ll A04;
    public C45442KAd A05;
    public C147046jg A06;
    public InterfaceC16820sZ A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC11380iw A0D;
    public final InterfaceC1119353f A0E;
    public final InterfaceC1118853a A0F;
    public final InterfaceC144586fe A0G;
    public final WeakReference A0H;
    public final InterfaceC09390do A0I = AbstractC09440dt.A00(EnumC09460dv.A02, new C9E5(this, 25));

    /* JADX WARN: Removed duplicated region for block: B:47:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(android.content.Context r23, android.view.View r24, X.AbstractC59962oe r25, X.C41181vS r26, java.lang.String r27, java.lang.String r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145356gu.A01(android.content.Context, android.view.View, X.2oe, X.1vS, java.lang.String, java.lang.String, boolean):void");
    }

    public C145356gu(InterfaceC11380iw interfaceC11380iw, InterfaceC1119353f interfaceC1119353f, InterfaceC1118853a interfaceC1118853a, InterfaceC144586fe interfaceC144586fe, WeakReference weakReference) {
        this.A0H = weakReference;
        this.A0F = interfaceC1118853a;
        this.A0G = interfaceC144586fe;
        this.A0E = interfaceC1119353f;
        this.A0D = interfaceC11380iw;
    }

    public static final boolean A00(Context context, C41181vS c41181vS, C145356gu c145356gu) {
        if (c41181vS.CdW() && c41181vS.A0s()) {
            EnumC906041v enumC906041v = EnumC906041v.AD_DESTINATION_DIRECT_MESSAGE;
            UserSession userSession = c145356gu.A01;
            if (userSession == null) {
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            AndroidLink A04 = AbstractC84863qa.A04(context, userSession, c41181vS);
            if (A04 != null) {
                if (enumC906041v == AbstractC114965Hm.A01(A04)) {
                    return true;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return false;
    }
}
