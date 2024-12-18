package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.wonderwall.model.WallText;
import java.util.List;

/* renamed from: X.DbX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30488DbX extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30488DbX(int i, int i2, Object obj, Object obj2, boolean z) {
        super(2);
        this.A00 = i2;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = z;
        this.A01 = i;
    }

    public static int A00(C30488DbX c30488DbX) {
        return AbstractC128295qy.A00(c30488DbX.A01 | 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                AbstractC28376Cfe.A03(A0S, (Modifier) this.A03, (InterfaceC16820sZ) this.A02, A00(this), this.A04);
                break;
            case 1:
                boolean z = this.A04;
                AbstractC28014CWm.A00((BXF) this.A03, A0S, (BIZ) this.A02, A00(this), z);
                break;
            case 2:
            case 3:
            default:
                AbstractC28291Cdd.A01(A0S, (InterfaceC16820sZ) this.A03, (C5Hc) this.A02, A00(this), this.A04);
                break;
            case 4:
                boolean z2 = this.A04;
                AbstractC28294Cdg.A01(A0S, (Modifier) this.A03, (InterfaceC156146zi) this.A02, A00(this), z2);
                break;
            case 5:
                InterfaceC30805Dgg interfaceC30805Dgg = (InterfaceC30805Dgg) this.A02;
                AbstractC25705BXp.A0D(A0S, (Modifier) this.A03, interfaceC30805Dgg, A00(this), this.A04);
                break;
            case 6:
                CYC.A00(A0S, (InterfaceC30812Dgn) this.A02, (InterfaceC16660sJ) this.A03, A00(this), this.A04);
                break;
            case 7:
                AbstractC28306Cds.A00(A0S, (C28224CcU) this.A02, (InterfaceC16660sJ) this.A03, A00(this), this.A04);
                break;
            case 8:
                AbstractC28464ChG.A05(A0S, (InterfaceC16820sZ) this.A02, (InterfaceC16820sZ) this.A03, A00(this), this.A04);
                break;
            case 9:
                AbstractC28310Cdw.A02(A0S, (InterfaceC16820sZ) this.A02, (InterfaceC16820sZ) this.A03, A00(this), this.A04);
                break;
            case 10:
                CHX.A00(A0S, (EnumC27394C6x) this.A02, (InterfaceC16820sZ) this.A03, A00(this), this.A04);
                break;
            case 11:
                boolean z3 = this.A04;
                AbstractC28440Cgo.A01(A0S, (C50526MSf) this.A02, (InterfaceC16820sZ) this.A03, A00(this), z3);
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                AbstractC28497Chq.A03(A0S, (C51753Mtc) this.A03, (InterfaceC16820sZ) this.A02, A00(this), this.A04);
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                AbstractC28489Chh.A07(A0S, (InterfaceC16820sZ) this.A02, (InterfaceC16820sZ) this.A03, A00(this), this.A04);
                break;
            case 14:
                ((C28197Cbu) this.A03).A00(A0S, (InterfaceC16820sZ) this.A02, A00(this), this.A04);
                break;
            case Process.SIGTERM /* 15 */:
                AbstractC28061CYp.A00(A0S, (Modifier) this.A02, (InterfaceC16820sZ) this.A03, A00(this), this.A04);
                break;
            case 16:
                AbstractC28508Ci2.A0D(A0S, (InterfaceC16820sZ) this.A02, (InterfaceC16820sZ) this.A03, A00(this), this.A04);
                break;
            case 17:
                BY0.A01(A0S, (C51759Mti) this.A03, (InterfaceC16660sJ) this.A02, A00(this), this.A04);
                break;
            case 18:
                BY0.A06(A0S, (List) this.A02, (InterfaceC16660sJ) this.A03, A00(this), this.A04);
                break;
            case Process.SIGSTOP /* 19 */:
                AbstractC28333CeL.A02(A0S, (Modifier) this.A02, (InterfaceC16820sZ) this.A03, A00(this), this.A04);
                break;
            case 20:
                AbstractC28405CgB.A01(A0S, (WallText) this.A03, (InterfaceC16820sZ) this.A02, A00(this), this.A04);
                break;
        }
        return C0eB.A00;
    }
}
