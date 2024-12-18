package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.soloader.SoLoaderDSONotFoundError;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.creation.persistence.CreationDatabase;
import com.instagram.creation.persistence.CreationDatabase_Impl;
import com.instagram.monetization.api.MonetizationApi;
import com.instagram.monetization.onboarding.repository.OnboardingRepository;
import com.instagram.newsfeed.data.ActivityFeedRecommendedUserRepository;
import com.instagram.newsfeed.fragment.NewsfeedFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.roomdb.IgRoomDatabase;
import com.instagram.user.model.User;
import go.Seq;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Pg5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57531Pg5 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57531Pg5(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static C57531Pg5 A00(Object obj, Object obj2, int i) {
        return new C57531Pg5(i, obj, obj2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.Nq4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, X.8KP] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C2PY c2py;
        InterfaceC09390do interfaceC09390do;
        C25279BGt c25279BGt;
        Object obj;
        C61182qg Bnn;
        Class cls;
        int i;
        C07N c07n;
        Object invoke;
        C07N c07n2;
        InterfaceC52932ba defaultViewModelProviderFactory;
        Object invoke2;
        switch (this.A00) {
            case 0:
                Context context = (Context) this.A01;
                Object obj2 = this.A02;
                C14360o3.A0B(context, 0);
                C57247PbV c57247PbV = new C57247PbV(obj2, 24);
                C57247PbV c57247PbV2 = new C57247PbV(obj2, 25);
                C57745PjY A00 = C57745PjY.A00(obj2, 24);
                try {
                    c57247PbV.invoke();
                    C09170dP.A06(context.getApplicationContext(), 0);
                    C09170dP.A0C("calpreload");
                    c57247PbV2.invoke();
                } catch (SoLoaderDSONotFoundError | IOException | Exception | UnsatisfiedLinkError e) {
                    A00.invoke(e);
                }
                return Boolean.valueOf(AbstractC53603NnA.A01);
            case 1:
                return new C22931A9b(AbstractC166987dD.A0O((Context) this.A01), (UserSession) this.A02);
            case 2:
                return new OnboardingRepository(new MonetizationApi((UserSession) this.A02), (HashMap) this.A01);
            case 3:
                RecyclerView A0G = AbstractC31172DnG.A0G((View) this.A01, R.id.h_scroll_recycle_view);
                AbstractC31174DnI.A17(A0G.getContext(), A0G, false);
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C14360o3.A0F("recyclerAdapter");
                throw C00O.createAndThrow();
            case 4:
            case 6:
            case 8:
            case Process.SIGSTOP /* 19 */:
            case 21:
            case 33:
            case 36:
            case 38:
            case 39:
            case 44:
            case 48:
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
                InterfaceC018407e A0i2 = AbstractC25228BEl.A0i(this.A01);
                if ((A0i2 instanceof C07N) && (c07n2 = (C07N) A0i2) != null && (defaultViewModelProviderFactory = c07n2.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                return ((Fragment) this.A02).getDefaultViewModelProviderFactory();
            case 7:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
            case 18:
            case 20:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 30:
            case 31:
            case 32:
            default:
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ2 == null || (invoke2 = interfaceC16820sZ2.invoke()) == null) {
                    return AbstractC25231BEo.A0V(this.A02);
                }
                return invoke2;
            case 9:
                Context context2 = (Context) this.A01;
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
                if (creationDatabase_Impl.A01 != null) {
                    c2py = creationDatabase_Impl.A01;
                } else {
                    synchronized (creationDatabase_Impl) {
                        if (creationDatabase_Impl.A01 == null) {
                            creationDatabase_Impl.A01 = new C2PY(creationDatabase_Impl);
                        }
                        c2py = creationDatabase_Impl.A01;
                    }
                }
                ?? obj3 = new Object();
                ?? obj4 = new Object();
                C48k A002 = C48k.A00(context2);
                C14360o3.A07(A002);
                C14360o3.A0B(context2, 0);
                C209419Oa c209419Oa = new C209419Oa(context2, obj4, c2py, A002, obj3, C2Ps.A00(context2, userSession));
                C14120nc.A00().ATO(new MYW(c209419Oa));
                return c209419Oa;
            case 34:
                return new NC2((MusicProduct) this.A01, AbstractC166987dD.A0r(((NQI) this.A02).A0A));
            case 35:
                UserSession userSession2 = (UserSession) this.A02;
                return new ActivityFeedRecommendedUserRepository(userSession2, C57582kX.A00(userSession2), AbstractC129875tr.A00(userSession2), (InterfaceC168017ew) this.A01);
            case 37:
                interfaceC09390do = ((C26872BtZ) this.A02).A0A;
                ((AbstractC55352ga) interfaceC09390do.getValue()).Dcp((C4NL) this.A01);
                return C0eB.A00;
            case 40:
                ((CWX) this.A01).A01(((C26023BfC) this.A02).A01, false, false);
                return C0eB.A00;
            case Seq.NULL_REFNUM /* 41 */:
                C54781OIv c54781OIv = (C54781OIv) this.A01;
                C26020Bf9 c26020Bf9 = (C26020Bf9) this.A02;
                C47P c47p = c26020Bf9.A01;
                int i3 = c26020Bf9.A00;
                C14360o3.A0B(c47p, 0);
                N82 n82 = c54781OIv.A01;
                User CDj = c47p.CDj();
                C14360o3.A0B(CDj, 0);
                n82.A02.A06(CDj, new C57245PbT(n82, 44), new C57752Pjf(n82, 11), false, false);
                String id = c47p.getId();
                C63702ur c63702ur = c54781OIv.A02;
                C6PG c6pg = new C6PG("fullscreen", id, c63702ur.A02);
                c6pg.A00 = i3;
                c6pg.A04 = c47p.getAlgorithm();
                String CEI = c47p.CEI();
                if (CEI != null) {
                    c6pg.A07 = CEI;
                }
                c6pg.A0B = c47p.ByJ();
                c6pg.A0C = c47p.C9e();
                c6pg.A0A = C63702ur.A00(c47p.CDj());
                c63702ur.A08(new C6PH(c6pg));
                return C0eB.A00;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                interfaceC09390do = ((NewsfeedFragment) this.A02).A08;
                ((AbstractC55352ga) interfaceC09390do.getValue()).Dcp((C4NL) this.A01);
                return C0eB.A00;
            case 43:
                InterfaceC09390do interfaceC09390do2 = ((MUI) this.A02).A0H;
                return new MUD((MUP) ((C25281BGw) AbstractC25226BEj.A1B(this.A01)).A05, MUT.A01(interfaceC09390do2), MUT.A00(interfaceC09390do2));
            case 45:
                Object A0L = AbstractC001800i.A0L((List) this.A01);
                if ((A0L instanceof C25279BGt) && (c25279BGt = (C25279BGt) A0L) != null && !c25279BGt.A00) {
                    AbstractC166987dD.A1Y(this.A02);
                }
                return C0eB.A00;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C8CY c8cy = (C8CY) this.A02;
                obj = this.A01;
                Bnn = c8cy.A00.Bnn();
                cls = C31690Dvv.class;
                i = 23;
                return Bnn.A00(cls, new C57518Pfs(obj, i));
            case 47:
                C8CY c8cy2 = (C8CY) this.A02;
                obj = this.A01;
                Bnn = c8cy2.A00.Bnn();
                cls = MV2.class;
                i = 24;
                return Bnn.A00(cls, new C57518Pfs(obj, i));
            case 49:
                ((C136946Hx) this.A02).A02(null, AbstractC25230BEn.A1X((InterfaceC74953Yl) this.A01));
                return C0eB.A00;
        }
    }
}
