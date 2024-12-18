package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore;
import com.instagram.creation.capture.quickcapture.sundial.remix.repository.ClipsRemixOriginalMediaRepository;
import com.instagram.creation.persistence.CreationDatabase;
import com.instagram.creation.persistence.CreationDatabase_Impl;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.roomdb.IgRoomDatabase;
import go.Seq;
import java.util.List;

/* renamed from: X.Pbe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57256Pbe extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57256Pbe(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.Nsf, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C2PZ c2pz;
        Object obj;
        C07N c07n;
        Object invoke;
        C07N c07n2;
        InterfaceC52932ba defaultViewModelProviderFactory;
        Object invoke2;
        switch (this.A00) {
            case 0:
                ((InterfaceC25184BCh) this.A01).DDv(this.A02);
                return C0eB.A00;
            case 1:
            case 2:
            case 3:
            case 4:
            case 7:
            case 10:
            case 14:
            case Process.SIGTERM /* 15 */:
            case Process.SIGSTOP /* 19 */:
            case 31:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 43:
            case 48:
            case 49:
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ != null && (invoke = interfaceC16820sZ.invoke()) != null) {
                    return invoke;
                }
                InterfaceC018407e A0i = AbstractC25228BEl.A0i(this.A02);
                if ((A0i instanceof C07N) && (c07n = (C07N) A0i) != null) {
                    return c07n.getDefaultViewModelCreationExtras();
                }
                return C52962bd.A00;
            case 5:
                ((StoryDraftsStore) this.A02).A04.remove(this.A01);
                return C0eB.A00;
            case 6:
                return new C195518kr((Context) this.A01, (UserSession) this.A02);
            case 8:
            case 9:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 25:
            case 26:
            case 27:
            case 28:
            case 30:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 38:
            case Seq.NULL_REFNUM /* 41 */:
            case 44:
            case 45:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            default:
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ2 == null || (invoke2 = interfaceC16820sZ2.invoke()) == null) {
                    return AbstractC25231BEo.A0V(this.A02);
                }
                return invoke2;
            case 11:
                NI7 ni7 = (NI7) this.A02;
                C51164Mj7 c51164Mj7 = ni7.A0D;
                NIW niw = ni7.A0H;
                int A07 = MSZ.A07(((AbstractC50863Mdu) niw).A01);
                Integer[] numArr = ni7.A0B.A02;
                c51164Mj7.A01(A07, MSW.A07(numArr, 0), MSW.A07(numArr, 1));
                niw.A0U(ni7.A05, MSW.A07(numArr, 0), MSW.A07(numArr, 1), true, AbstractC167007dF.A1X(this.A01, C05F.A00), false);
                NI7.A04(ni7, MSW.A07(numArr, 0), MSW.A07(numArr, 1));
                return true;
            case 16:
                NI6 ni6 = (NI6) this.A02;
                if (ni6.A0H.A0E() instanceof C8T0) {
                    C51165Mj8 c51165Mj8 = ni6.A0C;
                    NIX nix = ni6.A0J;
                    int A072 = MSZ.A07(((AbstractC50863Mdu) nix).A01);
                    Integer[] numArr2 = ni6.A0B.A02;
                    c51165Mj8.A01(A072, MSW.A07(numArr2, 0), MSW.A07(numArr2, 1));
                    nix.A0Y(ni6.A01, MSW.A07(numArr2, 0), MSW.A07(numArr2, 1), true, AbstractC167007dF.A1X(this.A01, C05F.A00));
                    NI6.A03(ni6, MSW.A07(numArr2, 0), MSW.A07(numArr2, 1));
                    return true;
                }
                return false;
            case 17:
                AbstractC166987dD.A1Y(this.A01);
                NI5 ni5 = (NI5) this.A02;
                ((OXZ) ni5).A02 = true;
                ni5.A0F.A03.setIsLongpressEnabled(true);
                return C0eB.A00;
            case 18:
                ((NI5) this.A02).A0P((List) this.A01);
                return C0eB.A00;
            case 20:
                InterfaceC018407e A0i2 = AbstractC25228BEl.A0i(this.A01);
                if ((A0i2 instanceof C07N) && (c07n2 = (C07N) A0i2) != null && (defaultViewModelProviderFactory = c07n2.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                return ((Fragment) this.A02).getDefaultViewModelProviderFactory();
            case 21:
                C56050OuP c56050OuP = (C56050OuP) this.A02;
                C52408NHe c52408NHe = (C52408NHe) c56050OuP.A0M;
                if (c52408NHe != null) {
                    c52408NHe.A08((AbstractC187378Sf) this.A01);
                }
                C56050OuP.A00(c56050OuP, (AbstractC187378Sf) this.A01);
                return C0eB.A00;
            case 22:
                AbstractC51134Mid abstractC51134Mid = ((C56050OuP) this.A02).A0M;
                int segmentIndex = ((AbstractC187488Sq) ((AbstractC187378Sf) this.A01)).getSegmentIndex();
                abstractC51134Mid.A03(segmentIndex);
                C52408NHe c52408NHe2 = (C52408NHe) abstractC51134Mid;
                int i = c52408NHe2.A00;
                c52408NHe2.A00 = segmentIndex;
                c52408NHe2.notifyItemChanged((i * 2) + 1);
                c52408NHe2.notifyItemChanged((segmentIndex * 2) + 1);
                return C0eB.A00;
            case 23:
                Context A0L = AbstractC166997dE.A0L((View) this.A01);
                C55889Ord c55889Ord = new C55889Ord();
                C211029Uz c211029Uz = (C211029Uz) this.A02;
                C23751AfO c23751AfO = new C23751AfO(c211029Uz, 1);
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C88M(A0L, c55889Ord, c211029Uz.A05, c23751AfO);
            case 24:
                C211029Uz c211029Uz2 = (C211029Uz) this.A02;
                int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new AnonymousClass889((View) this.A01, c211029Uz2.A05, true, false);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                Context context = (Context) this.A01;
                UserSession userSession = (UserSession) this.A02;
                C49242Of c49242Of = CreationDatabase.A00;
                IgRoomDatabase A0p = MSW.A0p(userSession, CreationDatabase.class);
                if (A0p == null) {
                    synchronized (c49242Of) {
                        A0p = MSW.A0p(userSession, CreationDatabase.class);
                        if (A0p == null) {
                            A0p = AbstractC50522MSa.A0c(AbstractC43594JPz.A0K(userSession, c49242Of, CreationDatabase.class), userSession, c49242Of);
                        }
                    }
                }
                CreationDatabase_Impl creationDatabase_Impl = (CreationDatabase_Impl) ((CreationDatabase) A0p);
                if (creationDatabase_Impl.A03 != null) {
                    c2pz = creationDatabase_Impl.A03;
                } else {
                    synchronized (creationDatabase_Impl) {
                        if (creationDatabase_Impl.A03 == null) {
                            creationDatabase_Impl.A03 = new C2PZ(creationDatabase_Impl);
                        }
                        c2pz = creationDatabase_Impl.A03;
                    }
                }
                ?? obj2 = new Object();
                C12L c12l = C12L.A00;
                C12T c12t = c12l.A04;
                C48k A00 = C48k.A00(context);
                C14360o3.A07(A00);
                ClipsRemixOriginalMediaRepository clipsRemixOriginalMediaRepository = new ClipsRemixOriginalMediaRepository(context, userSession, obj2, c2pz, A00, c12t);
                AbstractC166987dD.A1Z(new C25024B5f(clipsRemixOriginalMediaRepository, null, 43), AbstractC167017dG.A0w(c12l, 645279623));
                return clipsRemixOriginalMediaRepository;
            case 37:
                Object obj3 = this.A02;
                View view = (View) this.A01;
                C14360o3.A0C(view, AbstractC43591JPw.A00(1205));
                TouchInterceptorFrameLayout touchInterceptorFrameLayout = (TouchInterceptorFrameLayout) view;
                touchInterceptorFrameLayout.COs(new ViewOnTouchListenerC48075LQa(3, obj3, touchInterceptorFrameLayout));
                return C0eB.A00;
            case 39:
                ((Dialog) this.A01).dismiss();
                obj = this.A02;
                AbstractC25228BEl.A1P(obj);
                return C0eB.A00;
            case 40:
                C195398kf c195398kf = (C195398kf) this.A02;
                synchronized (c195398kf) {
                    c195398kf.A00 = C16930sl.A00;
                    c195398kf.A01 = null;
                }
                obj = this.A01;
                AbstractC25228BEl.A1P(obj);
                return C0eB.A00;
            case 47:
                ((L66) this.A01).A00(((C45057Jwm) this.A02).A02);
                return C0eB.A00;
        }
    }
}
