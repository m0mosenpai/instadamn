package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.Eo7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33312Eo7 extends PJX {
    public final int A00;
    public final Object A01;

    public C33312Eo7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.PJX, X.MRA
    public final void Czw(boolean z) {
        switch (this.A00) {
            case 1:
                return;
            case 9:
                C45510KCz.A03((C45510KCz) this.A01).A05(true);
                return;
            case 10:
                ((C37605Gh0) this.A01).A0A.Cvx();
                return;
            default:
                super.Czw(z);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.PJX, X.MRA
    public final void Dfe() {
        FragmentActivity fragmentActivity;
        Context A0C;
        String A00;
        switch (this.A00) {
            case 0:
            case 1:
            case 2:
            case 3:
                A0C = (Context) this.A01;
                A00 = "request_error";
                C9GR.A0E(A0C, A00);
                return;
            case 4:
            case 5:
                fragmentActivity = ((Fragment) this.A01).requireActivity();
                C9GR.A0D(fragmentActivity, MSV.A00(61));
                return;
            case 6:
            default:
                super.Dfe();
                return;
            case 7:
                A0C = AbstractC31172DnG.A0C(this.A01);
                A00 = MSV.A00(61);
                C9GR.A0E(A0C, A00);
                return;
            case 8:
                fragmentActivity = ((C36006Fv4) this.A01).A02;
                C9GR.A0D(fragmentActivity, MSV.A00(61));
                return;
        }
    }

    @Override // X.PJX, X.MRA
    public final void DpZ(String str) {
        switch (this.A00) {
            case 4:
            case 5:
                return;
            case 6:
                FOB fob = (FOB) this.A01;
                Hashtag hashtag = fob.A00;
                String str2 = fob.A07;
                C19280xC A01 = C19280xC.A01("report_hashtag", fob.A04.getModuleName());
                A01.A0C(AbstractC58317Pt9.A00(946), "hashtag_inappropriate");
                A01.A0C(AbstractC58357Ptx.A01(0, 10, 6), str2);
                WE2.A03(A01, hashtag);
                InterfaceC37200GaB interfaceC37200GaB = fob.A06;
                int B6r = interfaceC37200GaB.B6r();
                int BM5 = interfaceC37200GaB.BM5();
                A01.A08(Integer.valueOf(B6r), "start_row");
                A01.A08(Integer.valueOf(BM5), "end_row");
                EnumC68206VFy Av9 = interfaceC37200GaB.Av9();
                C14360o3.A0A(Av9);
                WE1.A02(A01, Av9, interfaceC37200GaB.AvA());
                AbstractC31173DnH.A1S(A01, fob.A05);
                return;
            case 7:
                boolean equals = "ig_spam_v3".equals(str);
                HD4 hd4 = (HD4) this.A01;
                int i = -1;
                if (equals) {
                    i = 1;
                }
                HD4.A03(hd4, i);
                MUK.A02(HD4.A01(hd4)).A00 = true;
                return;
            case 8:
                C53W c53w = ((C36006Fv4) this.A01).A0E;
                int i2 = -1;
                if ("ig_spam_v3".equals(str)) {
                    i2 = 1;
                }
                c53w.Dy5(i2);
                return;
            case 9:
            default:
                super.DpZ(str);
                return;
            case 10:
                ((C37605Gh0) this.A01).A0A.DWz(str);
                return;
        }
    }
}
