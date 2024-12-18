package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7HF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7HF extends C7H2 {
    public C28270CdF A00;
    public final Activity A01;
    public final Context A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final InterfaceC83713oG A05;
    public final String A06;
    public final InterfaceC16820sZ A07;
    public final InterfaceC16820sZ A08;

    public C7HF(Activity activity, Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC83713oG interfaceC83713oG, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        super(userSession, null, C7GX.A07, null, null, interfaceC16820sZ, 2131958899, R.drawable.instagram_photo_gen_ai_pano_outline_24, 2131958899, 448);
        this.A04 = userSession;
        this.A08 = interfaceC16820sZ;
        this.A01 = activity;
        this.A02 = context;
        this.A07 = interfaceC16820sZ2;
        this.A05 = interfaceC83713oG;
        this.A06 = str;
        this.A03 = interfaceC11380iw;
        this.A00 = null;
    }

    public final void A05(AbstractC160207Gg abstractC160207Gg, C28270CdF c28270CdF) {
        C28270CdF c28270CdF2;
        int length;
        if (c28270CdF == null) {
            c28270CdF2 = null;
        } else {
            String str = c28270CdF.A01;
            if (str == null) {
                str = "";
            }
            UserSession userSession = this.A04;
            if (abstractC160207Gg != null && abstractC160207Gg.A01() == C7FZ.A06 && (length = str.length()) > 0) {
                String A05 = abstractC160207Gg.A05();
                if (AbstractC001900j.A0a(str, A05, false) && AbstractC31268Doq.A09(userSession) && A05 != null) {
                    int A08 = AbstractC001900j.A08(str, A05, 0, false) + A05.length();
                    if (A08 < length) {
                        str = str.substring(A08);
                        C14360o3.A07(str);
                    } else {
                        str = null;
                    }
                }
            }
            c28270CdF2 = new C28270CdF(str, c28270CdF.A00, c28270CdF.A03, c28270CdF.A02, c28270CdF.A04);
        }
        this.A00 = c28270CdF2;
    }
}
