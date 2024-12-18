package X;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.R;
import java.util.List;

/* renamed from: X.BlW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26387BlW extends AbstractC51572Yf {
    public final C51753Mtc A00;
    public final InterfaceC11380iw A01;
    public final boolean A02;
    public final boolean A03;

    public C26387BlW(C51753Mtc c51753Mtc, InterfaceC11380iw interfaceC11380iw, boolean z, boolean z2) {
        C14360o3.A0B(interfaceC11380iw, 1);
        this.A01 = interfaceC11380iw;
        this.A00 = c51753Mtc;
        this.A02 = z;
        this.A03 = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, X.2Vj] */
    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C51682Yq c51682Yq;
        float f;
        long j;
        C51722Yv c51722Yv;
        int i;
        C14360o3.A0B(c76223bS, 0);
        Context A00 = AbstractC77363dM.A00(c76223bS);
        String A0R = AnonymousClass001.A0R(this.A01.getModuleName(), "NotesMinimizedComponent");
        C51753Mtc c51753Mtc = this.A00;
        List list = (List) c51753Mtc.A02;
        int A002 = (int) AbstractC13880nE.A00(AbstractC77363dM.A00(c76223bS), 16.0f);
        Integer num = C05F.A00;
        C89553yv A05 = AbstractC89513yr.A05(A00, null, num, 3, null, null, A0R, list, A002, true, false);
        C75933ay c75933ay = C51722Yv.A02;
        Integer num2 = C05F.A01;
        BNU bnu = new BNU(A05, null, C9CU.A00(C9CU.A00(null, num, 0, A05.getIntrinsicWidth() | 9221401712017801216L), num2, 0, A05.getIntrinsicHeight() | 9221401712017801216L), false);
        int i2 = c51753Mtc.A01;
        if (i2 > 0) {
            C51722Yv A003 = C9CU.A00(null, C05F.A1F, 0, AbstractC25230BEn.A0M());
            String A0G = AbstractC77623dm.A0G(c76223bS, Integer.valueOf(i2), 2131956742);
            if (this.A02 && this.A03) {
                i = AbstractC53242c7.A07(AbstractC77363dM.A00(c76223bS));
            } else {
                i = R.color.design_dark_default_color_on_background;
            }
            int A09 = AbstractC25228BEl.A09(c76223bS, i);
            long A0r = AbstractC25232BEp.A0r(12.0f);
            Typeface typeface = Typeface.DEFAULT;
            long A0D = AbstractC25229BEm.A0D();
            C77723dw A0a = AbstractC25231BEo.A0a(c76223bS.A05, null, A0G, 0);
            AbstractC25233BEq.A19(c76223bS, A0a, A09, A0r);
            A0a.A0S(1);
            AbstractC25234BEr.A0n(typeface, c76223bS, A0a, A0D);
            A0a.A0X(num);
            AbstractC25234BEr.A1J(A0a, num, false, true);
            c51682Yq = AbstractC25227BEk.A0X(A003, A0a);
        } else {
            c51682Yq = null;
        }
        ?? obj = new Object();
        if (c51682Yq != null) {
            c51682Yq.A0J(c76223bS.A05, obj, 0, 0);
        }
        boolean z = this.A02;
        float f2 = 4.0f;
        float f3 = 8.0f;
        if (z) {
            f = 8.0f;
            if (obj.A01 > 0) {
                f = 9.0f;
            }
            f2 = 8.0f;
        } else {
            f = 4.0f;
        }
        long A092 = AbstractC25225BEi.A09(f2 / 2.0f);
        if (!z) {
            f3 = 2.0f;
        }
        long A093 = AbstractC25225BEi.A09(f3);
        long intrinsicWidth = (A05.getIntrinsicWidth() + obj.A01) | 9221401712017801216L;
        long max = Math.max(A05.getIntrinsicHeight(), obj.A00) | 9221401712017801216L;
        long A07 = ((int) (AbstractC25228BEl.A07(c76223bS, intrinsicWidth) + AbstractC13880nE.A00(AbstractC77363dM.A00(c76223bS), f))) | 9221401712017801216L;
        long A072 = ((int) (AbstractC25228BEl.A07(c76223bS, max) + AbstractC13880nE.A00(AbstractC77363dM.A00(c76223bS), f2))) | 9221401712017801216L;
        C51722Yv A004 = C9CU.A00(C9CU.A00(null, num, 0, A07), num2, 0, A072);
        if (z) {
            j = Double.doubleToRawLongBits(38.0d);
        } else {
            j = A072;
        }
        Integer num3 = C05F.A0Y;
        C51722Yv A14 = AbstractC25232BEp.A14(C9CU.A00(A004, num3, 0, j), 0, AbstractC25229BEm.A0F());
        if (z) {
            Context A005 = AbstractC77363dM.A00(c76223bS);
            int A094 = AbstractC25228BEl.A09(c76223bS, R.color.cds_white_a20);
            Context context = c76223bS.A05.A0C;
            boolean z2 = this.A03;
            int i3 = R.attr.igds_color_secondary_button_on_media_panavision_updated;
            if (z2) {
                i3 = R.attr.igds_color_elevated_background;
            }
            c51722Yv = AbstractC25232BEp.A16(null, num, new C25565BSc(A005, AbstractC25232BEp.A03(context, c76223bS, i3), A094, 3442, z2, true, false, false));
        } else {
            c51722Yv = null;
        }
        C51722Yv A006 = A14.A00(c51722Yv);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        if (!z) {
            A12.A00(new C26546Bo5(A07, A072, false));
        }
        return AbstractC25227BEk.A0W(AbstractC76963ci.A0I(AbstractC25233BEq.A0I(bnu, c51682Yq, A12.A00), A12, C9CU.A00(C9CU.A00(AbstractC25232BEp.A15(C9CU.A00(C9CU.A00(null, num, 0, intrinsicWidth), num2, 0, max), num3, EnumC77933eL.ABSOLUTE), C05F.A0C, 1, A092), C05F.A0N, 1, A093)), A12, c76223bS, A006);
    }
}
