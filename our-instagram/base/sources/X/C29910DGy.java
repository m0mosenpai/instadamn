package X;

import android.animation.AnimatorSet;
import android.widget.PopupWindow;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import com.meta.foa.session.FoaUserSession;
import com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel;
import go.Seq;

/* renamed from: X.DGy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29910DGy extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29910DGy(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static Object A00(C76223bS c76223bS, Object obj, Object[] objArr, int i) {
        return AbstractC77183d4.A00(c76223bS, new C29910DGy(obj, i), objArr);
    }

    public static C29910DGy A01(Object obj, int i) {
        return new C29910DGy(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v120, types: [X.2Xf, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C7V c7v;
        InterfaceC16660sJ interfaceC16660sJ;
        Object obj;
        C25811BbS c25811BbS;
        CA0 ca0;
        C76223bS c76223bS;
        C6C c6c;
        Object A06;
        switch (this.A00) {
            case 0:
                interfaceC16660sJ = ((C26566BoP) this.A01).A01;
                obj = C27307C3o.A00;
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case 1:
                C76223bS c76223bS2 = (C76223bS) this.A01;
                return Integer.valueOf(AbstractC167007dF.A0K(AbstractC77363dM.A00(c76223bS2)).widthPixels - AbstractC25232BEp.A0l(c76223bS2, 24.0d));
            case 2:
                AbstractC166987dD.A1Y(this.A01);
                return C0eB.A00;
            case 3:
                ((PopupWindow) ((C51762Yz) this.A01).A03).dismiss();
                return C0eB.A00;
            case 4:
                C26404Bln c26404Bln = (C26404Bln) this.A01;
                interfaceC16660sJ = c26404Bln.A02;
                obj = c26404Bln.A01;
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case 5:
                return new CVV(new Object(), AnonymousClass001.A0O("meta_ai_imagine_generated_image_more_", ((C26404Bln) this.A01).A00));
            case 6:
                interfaceC16660sJ = ((C26571BoU) this.A01).A02;
                obj = C27313C3u.A00;
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case 7:
                return C30482DbR.A00(this.A01, 48);
            case 8:
                return C30182DRn.A01(this.A01, 19);
            case 9:
                return C30182DRn.A01(this.A01, 20);
            case 10:
                return new C30750Dfn(this.A01, 25);
            case 11:
                return C30182DRn.A01(this.A01, 21);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                interfaceC16660sJ = ((C26453Bma) this.A01).A00;
                obj = C27314C3v.A00;
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                interfaceC16660sJ = ((C26453Bma) this.A01).A00;
                obj = C27316C3x.A00;
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case 14:
                interfaceC16660sJ = ((C26453Bma) this.A01).A00;
                obj = C27315C3w.A00;
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                if (!((C26453Bma) this.A01).A02) {
                    return new Object();
                }
                return null;
            case 16:
                return AbstractC25225BEi.A0p(AbstractC28406CgC.A02((C76223bS) this.A01, C05F.A0X));
            case 17:
                return AbstractC25225BEi.A0G(AbstractC28406CgC.A00((C76223bS) this.A01, C88.A0m));
            case 18:
                C76223bS c76223bS3 = (C76223bS) this.A01;
                return AbstractC28406CgC.A03(c76223bS3, C87.A0a, null, Integer.valueOf(AbstractC28406CgC.A00(c76223bS3, C88.A0u)));
            case Process.SIGSTOP /* 19 */:
                ((C25809BbQ) this.A01).A0E(C27309C3q.A00);
                return C0eB.A00;
            case 20:
                FoaUserSession foaUserSession = (FoaUserSession) this.A01;
                C14360o3.A0B(foaUserSession, 0);
                if (C18U.A06(C06090Tz.A05, AbstractC28057CYl.A00(foaUserSession), 36325763944232285L)) {
                    return C7H.A02;
                }
                return C7H.A06;
            case 21:
                return Boolean.valueOf(AbstractC27725CKs.A00((FoaUserSession) this.A01));
            case 22:
            case 27:
                CWI cwi = AbstractC28375Cfd.A0A((AbstractC28375Cfd) this.A01).A00;
                if (cwi != null) {
                    return cwi.A02.A00();
                }
                return null;
            case 23:
            case 24:
                C27332C4n.A00((C27332C4n) this.A01).A0F(C4K.A00);
                return AbstractC166997dE.A0b();
            case 25:
            case 30:
                return AbstractC28375Cfd.A0A((AbstractC28375Cfd) this.A01).A01().getViewModelStore();
            case 26:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            default:
                C27330C4l.A00((C27330C4l) this.A01).A0F(C4K.A00);
                return AbstractC166997dE.A0b();
            case 31:
                c76223bS = (C76223bS) this.A01;
                c6c = C6C.A02;
                C14360o3.A0B(c76223bS, 0);
                A06 = c76223bS.ArD().A06(CWA.class);
                if (A06 == null) {
                    throw AbstractC166997dE.A0g();
                }
                return ((CWA) A06).A01.AzM(AbstractC77363dM.A00(c76223bS), c6c);
            case 32:
                c76223bS = (C76223bS) this.A01;
                c6c = C6C.A03;
                C14360o3.A0B(c76223bS, 0);
                A06 = c76223bS.ArD().A06(CWA.class);
                if (A06 == null) {
                    throw AbstractC166997dE.A0g();
                }
                return ((CWA) A06).A01.AzM(AbstractC77363dM.A00(c76223bS), c6c);
            case 33:
                interfaceC16660sJ = ((C26550Bo9) this.A01).A01;
                obj = C4O.A00;
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case 34:
                return new CPY((C51762Yz) this.A01);
            case 35:
                ((C26493BnE) this.A01).A02.invoke(C4R.A00);
                return null;
            case 36:
                ((C26300Bk7) this.A01).A00.A0F(C4T.A00);
                return C0eB.A00;
            case 37:
                c25811BbS = ((C26329Bka) this.A01).A00;
                ca0 = C4V.A00;
                c25811BbS.A0F(ca0);
                return C0eB.A00;
            case 38:
            case 39:
                c25811BbS = ((C26434BmH) this.A01).A00;
                ca0 = C4N.A00;
                c25811BbS.A0F(ca0);
                return C0eB.A00;
            case 40:
                return ((C26434BmH) this.A01).A00.A0H.getValue();
            case Seq.NULL_REFNUM /* 41 */:
                return AbstractC166997dE.A0c(C06090Tz.A05, AbstractC28057CYl.A00(((C26434BmH) this.A01).A00.A0A), 36325763943576918L);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                BZA bza = (BZA) this.A01;
                bza.A00 = false;
                AnimatorSet animatorSet = bza.A01;
                if (animatorSet.isStarted()) {
                    animatorSet.end();
                }
                animatorSet.removeAllListeners();
                return C0eB.A00;
            case 43:
                interfaceC16660sJ = ((C26435BmI) this.A01).A00;
                obj = C4P.A00;
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case 44:
                C76223bS c76223bS4 = (C76223bS) this.A01;
                C87 c87 = C87.A05;
                C14360o3.A0B(c76223bS4, 0);
                return AbstractC28406CgC.A03(c76223bS4, c87, null, null);
            case 45:
                C76223bS c76223bS5 = (C76223bS) this.A01;
                C87 c872 = C87.A06;
                C14360o3.A0B(c76223bS5, 0);
                return AbstractC28406CgC.A03(c76223bS5, c872, null, null);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C76223bS c76223bS6 = (C76223bS) this.A01;
                C87 c873 = C87.A07;
                C14360o3.A0B(c76223bS6, 0);
                return AbstractC28406CgC.A03(c76223bS6, c873, null, null);
            case 47:
                return Boolean.valueOf(AbstractC27725CKs.A00(((C25811BbS) this.A01).A0A));
            case 48:
                C7V[] c7vArr = new C7V[3];
                if (C18U.A06(C06090Tz.A05, AbstractC28057CYl.A00(((C25811BbS) this.A01).A0A), 36325763943576918L)) {
                    c7vArr[0] = C7V.A06;
                    c7vArr[1] = C7V.A05;
                    c7v = C7V.A04;
                } else {
                    c7vArr[0] = C7V.A04;
                    c7vArr[1] = C7V.A06;
                    c7v = C7V.A05;
                }
                c7vArr[2] = c7v;
                return AbstractC16960so.A1Q(c7vArr);
            case 49:
                PromptSheetAIViewModel promptSheetAIViewModel = ((C27329C4k) this.A01).A00;
                if (promptSheetAIViewModel == null) {
                    C14360o3.A0F("viewModel");
                    throw C00O.createAndThrow();
                }
                D51.A02(promptSheetAIViewModel, AbstractC141776au.A00(promptSheetAIViewModel), 26);
                return C0eB.A00;
        }
    }
}
