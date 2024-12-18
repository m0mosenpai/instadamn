package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.faceswarm.IgdsFaceSwarm;
import com.instagram.igtv.repository.user.UserNetworkDataSource;
import com.instagram.igtv.repository.user.UserRepository;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.upcomingevents.common.model.UpcomingEventReminderAction;
import com.instagram.user.model.UpcomingEvent;
import go.Seq;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.PbZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57251PbZ extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57251PbZ(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C50920Mep c50920Mep;
        UpcomingEventReminderAction upcomingEventReminderAction;
        Object value;
        C51736MtJ c51736MtJ;
        boolean z;
        C07N c07n;
        InterfaceC52932ba defaultViewModelProviderFactory;
        Object invoke;
        C07N c07n2;
        Object invoke2;
        Object invoke3;
        switch (this.A00) {
            case 0:
                ((C45999KXn) this.A02).A0Y(null);
                AbstractC166987dD.A1Y(this.A01);
                break;
            case 1:
                AbstractC166987dD.A1Y(this.A01);
                Collection collection = (Collection) ((C15370ps) this.A02).A00;
                if (!collection.isEmpty()) {
                    return collection;
                }
                return null;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 16:
            case 20:
            case 23:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 44:
            case 45:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            case 48:
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ != null && (invoke2 = interfaceC16820sZ.invoke()) != null) {
                    return invoke2;
                }
                InterfaceC018407e A0i = AbstractC25228BEl.A0i(this.A02);
                if ((A0i instanceof C07N) && (c07n2 = (C07N) A0i) != null) {
                    return c07n2.getDefaultViewModelCreationExtras();
                }
                return C52962bd.A00;
            case 7:
                IgdsFaceSwarm igdsFaceSwarm = (IgdsFaceSwarm) this.A02;
                Runnable runnable = igdsFaceSwarm.A07;
                if (runnable != null) {
                    runnable.run();
                }
                igdsFaceSwarm.A07 = null;
                IgdsFaceSwarm.A05(igdsFaceSwarm, (List) this.A01);
                break;
            case 8:
            case Process.SIGTERM /* 15 */:
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 22:
            case 25:
            case 26:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 43:
            default:
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ2 == null || (invoke3 = interfaceC16820sZ2.invoke()) == null) {
                    return AbstractC25231BEo.A0V(this.A02);
                }
                return invoke3;
            case 10:
                return new UserRepository((UserSession) this.A02, (UserNetworkDataSource) this.A01);
            case 11:
                C45504KCt c45504KCt = (C45504KCt) this.A02;
                if (c45504KCt.mFragmentManager != null) {
                    Activity activity = (Activity) this.A01;
                    C50674MYs A0W = AbstractC31177DnL.A0W(activity, c45504KCt.A07);
                    A0W.A01(new ViewOnClickListenerC48074LPz(c45504KCt, 67), 2131964179);
                    A0W.A03(ViewOnClickListenerC55455Ok9.A00(c45504KCt, 15), 2131964190);
                    C31727DwY.A00(activity, A0W);
                    break;
                }
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                Context A0L = AbstractC166997dE.A0L((View) this.A01);
                C44753Jra c44753Jra = (C44753Jra) this.A02;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return C3LQ.A05(A0L, R.drawable.verified_profile, c44753Jra.A00);
            case 14:
                InterfaceC16820sZ interfaceC16820sZ3 = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ3 != null && (invoke = interfaceC16820sZ3.invoke()) != null) {
                    return invoke;
                }
                return ((ComponentActivity) this.A02).getDefaultViewModelCreationExtras();
            case 17:
            case 21:
            case 24:
                InterfaceC018407e A0i2 = AbstractC25228BEl.A0i(this.A01);
                if ((A0i2 instanceof C07N) && (c07n = (C07N) A0i2) != null && (defaultViewModelProviderFactory = c07n.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                return ((Fragment) this.A02).getDefaultViewModelProviderFactory();
            case 27:
                AbstractC52160N6m abstractC52160N6m = (AbstractC52160N6m) this.A02;
                InterfaceC09390do interfaceC09390do = abstractC52160N6m.A0D;
                ClipInfo clipInfo = NNE.A01(interfaceC09390do).A1N;
                C47Z A01 = NNE.A01(interfaceC09390do);
                Context context = (Context) this.A01;
                InterfaceC09390do interfaceC09390do2 = abstractC52160N6m.A0C;
                C24197AoK c24197AoK = new C24197AoK(context, AbstractC166987dD.A0r(interfaceC09390do2), A01, clipInfo.A09 / clipInfo.A06);
                float f = clipInfo.A09 / clipInfo.A06;
                int i2 = clipInfo.A07;
                int i3 = clipInfo.A05;
                OEB A00 = AbstractC54906OQd.A00(clipInfo);
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do2);
                C14360o3.A0B(A0r, 5);
                return new C55570Om6(A0r, c24197AoK, A00, f, i2, i3);
            case 39:
                PIR pir = ((OET) this.A02).A01;
                boolean z2 = !((C51736MtJ) this.A01).A05;
                P49 p49 = pir.A01;
                UpcomingEvent upcomingEvent = p49.A08;
                if (upcomingEvent != null) {
                    if (z2) {
                        c50920Mep = p49.A06;
                        upcomingEventReminderAction = UpcomingEventReminderAction.A04;
                    } else {
                        UserSession userSession = p49.A02;
                        boolean A06 = C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36324217754562539L);
                        c50920Mep = p49.A06;
                        if (A06) {
                            C05A c05a = c50920Mep.A04;
                            do {
                                value = c05a.getValue();
                                c51736MtJ = (C51736MtJ) value;
                            } while (!c05a.AIi(value, C51736MtJ.A01(c51736MtJ, c51736MtJ.A02, AbstractC001800i.A0T(P4H.A00, c51736MtJ.A04), c51736MtJ.A05)));
                        } else {
                            upcomingEventReminderAction = UpcomingEventReminderAction.A05;
                        }
                    }
                    OCN ocn = new OCN(c50920Mep.A00, upcomingEventReminderAction, upcomingEvent, "iab_reminder_ads_footer");
                    int ordinal = upcomingEventReminderAction.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            z = false;
                        } else {
                            throw B4Z.A00();
                        }
                    } else {
                        z = true;
                    }
                    AbstractC166987dD.A1Z(new C71765X2b(c50920Mep, ocn, upcomingEvent, null, z), AbstractC141776au.A00(c50920Mep));
                    break;
                }
                break;
            case 40:
                C1UC c1uc = (FragmentActivity) this.A01;
                if (!(c1uc instanceof C2d5)) {
                    c1uc = null;
                }
                OET oet = (OET) this.A02;
                View view = oet.A02.A01;
                return new C146096i7(AbstractC166997dE.A0L(view), (C2d5) c1uc).A00(null, C39412Haw.A00, oet.A04, Integer.valueOf(view.getHeight()));
            case Seq.NULL_REFNUM /* 41 */:
                AbstractC12990ll A0o = AbstractC166987dD.A0o(((C172707mf) this.A02).A08);
                C14360o3.A0B(A0o, 0);
                SF2 sf2 = (SF2) A0o.A01(SF2.class, new C57510Pfk(A0o, 40));
                Object obj = this.A01;
                C14360o3.A0B(obj, 0);
                List list = sf2.A01;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next().getClass() == obj.getClass()) {
                            break;
                        }
                    }
                }
                list.add(obj);
                break;
            case 47:
                ((InterfaceC16660sJ) this.A02).invoke(this.A01);
                break;
            case 49:
                return new C2JV((Context) this.A01, (UserSession) this.A02);
        }
        return C0eB.A00;
    }
}
