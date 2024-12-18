package X;

import android.content.Context;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.VQs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68436VQs {
    public static final String A00(C6FQ c6fq, C6FW c6fw) {
        C71173WpB c71173WpB;
        InterfaceC08430c6 A00;
        InterfaceC103384lE A0B;
        boolean z = false;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) A03;
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A02;
        Object A002 = c6fw.A00();
        C14360o3.A0C(A002, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        Object A032 = c6fw.A03(3);
        C14360o3.A0C(A032, "null cannot be cast to non-null type java.util.HashMap<kotlin.Any, kotlin.Any>");
        HashMap hashMap = (HashMap) A032;
        C6FG A003 = C103064kh.A00(c6fq, c6fw, 4);
        Map A0B2 = U5E.A0B(c6fq, (C102884kP) A002, 36);
        C102884kP A04 = U5E.A04(U5E.A09(c102884kP), 15932);
        if (A04 != null && (A0B = A04.A0B(40)) != null) {
            c71173WpB = new C71173WpB(A003, c6fq, A0B, 0);
        } else {
            c71173WpB = null;
        }
        String A07 = U5E.A07(c102884kP);
        String A06 = U5E.A06(c102884kP);
        Object A004 = VM9.A00(hashMap);
        if (A004 == null) {
            A004 = AbstractC06930Yk.A0E();
        }
        C14360o3.A0C(A004, MSV.A00(21));
        C66273U6s c66273U6s = new C66273U6s(null, null, null, null, null, A07, null, null, (HashMap) A004, new ArrayList(), null, A0B2, A0B2, -1, U5E.A00(c102884kP), -1L, -1L, false, false);
        C62862tP A062 = C6BQ.A06(c6fq);
        int A005 = AbstractC68280VKs.A00(A04);
        if (A04 != null && A04.A0S(48, false)) {
            z = true;
        }
        C14360o3.A0A(A003);
        C34397FEn c34397FEn = new C34397FEn(C6BQ.A0A(A003));
        boolean z2 = A062.A00;
        IgBloksScreenConfig igBloksScreenConfig = c34397FEn.A00;
        igBloksScreenConfig.A0c = z2;
        U5K A006 = U5L.A00(null, A003, c6fq, U5E.A03(c102884kP));
        if (A006 != null) {
            igBloksScreenConfig.A06(A006);
        }
        C1338462s A007 = VR1.A00(c6fq, c102884kP);
        if (igBloksScreenConfig.A07 == null) {
            igBloksScreenConfig.A07 = A007;
        }
        igBloksScreenConfig.A0R = A06;
        if (U5E.A0C(c102884kP)) {
            igBloksScreenConfig.A0A = U5E.A05(c102884kP);
        }
        String A08 = U5E.A08(c102884kP);
        Context context = A003.A00;
        C68111VBu c68111VBu = new C68111VBu(c71173WpB, A005, z);
        C191778eZ A042 = igBloksScreenConfig.A04();
        C1338462s c1338462s = igBloksScreenConfig.A07;
        C14360o3.A0B(str, 1);
        WGI wgi = WGI.A00;
        List A033 = C66224U4u.A03(C66224U4u.A00(context));
        if (A033 != null && !A033.isEmpty() && (A00 = WGI.A00(wgi, str, A033)) != null) {
            InterfaceC72040XGi interfaceC72040XGi = (InterfaceC72040XGi) A00;
            XBU Bdi = interfaceC72040XGi.Bdi(EnumC68125VCj.A02);
            C14360o3.A0C(Bdi, "null cannot be cast to non-null type com.bloks.foa.cds.bottomsheet.intf.CdsBloksBottomSheetBehavior");
            interfaceC72040XGi.COd(WGI.A01(context, c66273U6s, (C66209U4f) Bdi, c1338462s, A042, A08), c68111VBu, str);
            return A08;
        }
        AbstractC25241Le.A02("CDSBloksBottomSheetController", "Cannot insert a new Screen without a valid bottom sheet - no bottom sheet contains the screen ID");
        return A08;
    }
}
