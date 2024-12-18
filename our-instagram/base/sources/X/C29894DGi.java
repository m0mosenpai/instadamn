package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.AchievementButtonInfo;
import com.instagram.api.schemas.AchievementIntf;
import com.instagram.api.schemas.CloseToEarningAchievementMediaIntf;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.DGi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29894DGi extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29894DGi(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public static C29894DGi A00(C5Tl c5Tl, Object obj, Object obj2, int i) {
        C29894DGi c29894DGi = new C29894DGi(i, obj, obj2);
        c5Tl.FBy(c29894DGi);
        return c29894DGi;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InterfaceC16660sJ interfaceC16660sJ;
        Object obj;
        BP5 bp5;
        C8p c8p;
        Object value;
        C26067Bfv A00;
        Object invoke;
        C07N c07n;
        InterfaceC52932ba defaultViewModelProviderFactory;
        C07N c07n2;
        Object invoke2;
        switch (this.A00) {
            case 0:
            case 5:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 16:
            case 32:
            case 33:
            case 39:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A02;
                obj = this.A01;
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case 1:
            case 3:
            case 4:
            case 17:
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 22:
            case 24:
            case 35:
            case 36:
            case Seq.NULL_REFNUM /* 41 */:
            case 44:
            default:
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ == null || (invoke2 = interfaceC16820sZ.invoke()) == null) {
                    InterfaceC018407e A0i = AbstractC25228BEl.A0i(this.A02);
                    if ((A0i instanceof C07N) && (c07n2 = (C07N) A0i) != null) {
                        return c07n2.getDefaultViewModelCreationExtras();
                    }
                    return C52962bd.A00;
                }
                return invoke2;
            case 2:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A02;
                obj = ((C26042BfV) this.A01).A01;
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case 6:
            case 8:
            case 37:
            case 38:
            case 49:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                obj = this.A02;
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case 7:
                AchievementIntf achievementIntf = (AchievementIntf) this.A01;
                AchievementButtonInfo BrN = achievementIntf.BrN();
                if (BrN != null) {
                    ((InterfaceC16620sF) this.A02).invoke(achievementIntf, BrN);
                }
                return C0eB.A00;
            case 9:
                Object obj2 = this.A02;
                if (obj2 != null) {
                    AbstractC25225BEi.A1U(this.A01, obj2);
                }
                return C0eB.A00;
            case 14:
                ((InterfaceC16660sJ) this.A02).invoke(((CloseToEarningAchievementMediaIntf) this.A01).getMediaId());
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A02;
                obj = ((C26062Bfp) this.A01).A02;
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case 20:
                bp5 = (BP5) this.A01;
                c8p = C8p.A0Y;
                bp5.A04(c8p, bp5.A00);
                AbstractC166987dD.A1Y(this.A02);
                return C0eB.A00;
            case 21:
                BP5 bp52 = (BP5) this.A02;
                bp52.A04(C8p.A0b, bp52.A00);
                C12260kU.A0G((Context) this.A01, AbstractC08820cl.A03("https://help.instagram.com/1164300158112141"));
                return C0eB.A00;
            case 23:
                InterfaceC018407e A0i2 = AbstractC25228BEl.A0i(this.A01);
                if ((A0i2 instanceof C07N) && (c07n = (C07N) A0i2) != null && (defaultViewModelProviderFactory = c07n.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                return ((Fragment) this.A02).getDefaultViewModelProviderFactory();
            case 25:
                ((C7Uo) this.A02).A01.F9e((InterfaceC19620xp) this.A01);
                return C0eB.A00;
            case 26:
            case 28:
            case 31:
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ2 != null && (invoke = interfaceC16820sZ2.invoke()) != null) {
                    return invoke;
                }
                return AbstractC25231BEo.A0V(this.A02);
            case 27:
                bp5 = (BP5) this.A01;
                c8p = C8p.A0K;
                bp5.A04(c8p, bp5.A00);
                AbstractC166987dD.A1Y(this.A02);
                return C0eB.A00;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                bp5 = (BP5) this.A01;
                c8p = C8p.A02;
                bp5.A04(c8p, bp5.A00);
                AbstractC166987dD.A1Y(this.A02);
                return C0eB.A00;
            case 30:
                bp5 = (BP5) this.A01;
                c8p = C8p.A03;
                bp5.A04(c8p, bp5.A00);
                AbstractC166987dD.A1Y(this.A02);
                return C0eB.A00;
            case 34:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                obj = AbstractC25226BEj.A1A(this.A02);
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case 40:
                InterfaceC16610sE interfaceC16610sE = (InterfaceC16610sE) this.A02;
                C25984BeY c25984BeY = (C25984BeY) this.A01;
                interfaceC16610sE.invoke(c25984BeY.A00, c25984BeY.A02, c25984BeY.A01);
                return C0eB.A00;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C26749BrW c26749BrW = (C26749BrW) this.A02;
                ((BP5) c26749BrW.A00.getValue()).A01(C8j.DELETE_AI);
                if (((C26067Bfv) AbstractC25226BEj.A1B(this.A01)).A0C) {
                    Bundle A002 = AbstractC61636Rr0.A00(AbstractC166987dD.A1L("creator_ai_entry_point_extra", c26749BrW.A02.getValue()), AbstractC166987dD.A1L("creator_ai_creator_igid", c26749BrW.A01.getValue()));
                    C26737BrI c26737BrI = new C26737BrI();
                    c26737BrI.A00 = c26749BrW;
                    c26737BrI.setArguments(A002);
                    c26737BrI.setArguments(A002);
                    C189448aO A0g = AbstractC25231BEo.A0g(c26749BrW.A04);
                    AbstractC25225BEi.A1Q(A0g, false);
                    A0g.A0U = new C36720GGp(2);
                    A0g.A0v = true;
                    A0g.A0w = true;
                    A0g.A00().A02(c26749BrW.requireActivity(), c26737BrI);
                } else {
                    C05A c05a = AbstractC25229BEm.A0g(c26749BrW).A0A;
                    do {
                        value = c05a.getValue();
                        A00 = C26067Bfv.A00(null, null, (C26067Bfv) value, null, null, null, 253951, false, false, false, true);
                    } while (!c05a.AIi(value, A00));
                }
                return C0eB.A00;
            case 43:
                C26749BrW.A01((C26749BrW) this.A02, EnumC27403C7g.A0A, ((C26067Bfv) AbstractC25226BEj.A1B(this.A01)).A07);
                return C0eB.A00;
            case 45:
                bp5 = (BP5) this.A01;
                c8p = C8p.A0E;
                bp5.A04(c8p, bp5.A00);
                AbstractC166987dD.A1Y(this.A02);
                return C0eB.A00;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                bp5 = (BP5) this.A01;
                c8p = C8p.A0D;
                bp5.A04(c8p, bp5.A00);
                AbstractC166987dD.A1Y(this.A02);
                return C0eB.A00;
            case 47:
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A01;
                C26067Bfv c26067Bfv = (C26067Bfv) this.A02;
                AbstractC25227BEk.A1P(Integer.valueOf(c26067Bfv.A00), interfaceC16620sF, c26067Bfv.A01);
                return C0eB.A00;
            case 48:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                obj = ((C26067Bfv) this.A02).A05;
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
        }
    }
}
