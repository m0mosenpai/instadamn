package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.roomdb.IgRoomDatabase;
import com.instagram.showreel.composition.ui.IgShowreelCompositionView;
import com.instagram.sponsored.asyncads.pool.persistence.SponsoredPoolItemDatabase;
import com.instagram.sponsored.asyncads.pool.persistence.SponsoredPoolItemDatabase_Impl;
import com.instagram.sup.voltron.SUPMediaStreamControllerDownloader;
import com.instagram.trials.impl.TrialsPreferencesImpl;
import com.instagram.user.model.FriendshipStatus;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.9Do, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206839Do extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206839Do(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C50525MSe c50525MSe;
        InterfaceC25441Ly c42997Izn;
        InterfaceC25441Ly interfaceC25441Ly;
        C30381ct c30381ct;
        int i;
        switch (this.A00) {
            case 0:
                C69723Bg c69723Bg = (C69723Bg) this.A01;
                UserSession userSession = c69723Bg.A01;
                AbstractC59962oe abstractC59962oe = c69723Bg.A00;
                return new C38E(abstractC59962oe, userSession, new C38C(abstractC59962oe));
            case 1:
                UserSession userSession2 = ((C69723Bg) this.A01).A01;
                return userSession2.A01(C41220IMj.class, new J8V(userSession2, 2));
            case 2:
                return new C1567672c((UserSession) this.A01);
            case 3:
                C64862wk c64862wk = (C64862wk) this.A01;
                UserSession userSession3 = c64862wk.A03;
                InterfaceC60442pS interfaceC60442pS = c64862wk.A04;
                return new C42933Iyl(c64862wk.A02, userSession3, interfaceC60442pS, c64862wk.A05, c64862wk.A06, c64862wk.A07, c64862wk, c64862wk.A08, c64862wk.A09, c64862wk.A0A, c64862wk.A0C, c64862wk.A01);
            case 4:
                IgShowreelCompositionView igShowreelCompositionView = (IgShowreelCompositionView) this.A01;
                Context context = igShowreelCompositionView.getContext();
                C14360o3.A07(context);
                return new BFR(context, igShowreelCompositionView, igShowreelCompositionView);
            case 5:
                return new C104484nE((UserSession) this.A01);
            case 6:
                boolean z = C23051Ak.A05;
                C104524nI c104524nI = (C104524nI) this.A01;
                if (C23061Al.A00(c104524nI.A02).A00(EnumC23071Am.A0O)) {
                    i = c104524nI.A01;
                } else {
                    i = c104524nI.A00;
                }
                return Integer.valueOf(i);
            case 7:
                return AbstractC92484Cf.A00(((C689438f) this.A01).A00);
            case 8:
                return new C3ZC((UserSession) this.A01);
            case 9:
                return new C63432uQ((UserSession) this.A01);
            case 10:
                return C006802i.A0p;
            case 11:
                C30041cK c30041cK = SponsoredPoolItemDatabase.A00;
                UserSession userSession4 = (UserSession) this.A01;
                C14360o3.A0B(userSession4, 0);
                IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession4.A00(SponsoredPoolItemDatabase.class);
                if (igRoomDatabase == null) {
                    synchronized (c30041cK) {
                        igRoomDatabase = (IgRoomDatabase) userSession4.A00(SponsoredPoolItemDatabase.class);
                        if (igRoomDatabase == null) {
                            Context context2 = AbstractC12290kX.A00;
                            C14360o3.A07(context2);
                            C1Ye A00 = C1Yc.A00(context2, SponsoredPoolItemDatabase.class, C1YZ.A00(userSession4, c30041cK));
                            AbstractC28241Yh.A00(A00, 1782753325, 1265422814, true);
                            A00.A01();
                            igRoomDatabase = (IgRoomDatabase) A00.A00();
                            userSession4.A04(SponsoredPoolItemDatabase.class, igRoomDatabase);
                        }
                    }
                }
                SponsoredPoolItemDatabase_Impl sponsoredPoolItemDatabase_Impl = (SponsoredPoolItemDatabase_Impl) ((SponsoredPoolItemDatabase) igRoomDatabase);
                if (sponsoredPoolItemDatabase_Impl.A00 != null) {
                    return sponsoredPoolItemDatabase_Impl.A00;
                }
                synchronized (sponsoredPoolItemDatabase_Impl) {
                    if (sponsoredPoolItemDatabase_Impl.A00 == null) {
                        sponsoredPoolItemDatabase_Impl.A00 = new C30381ct(sponsoredPoolItemDatabase_Impl);
                    }
                    c30381ct = sponsoredPoolItemDatabase_Impl.A00;
                }
                return c30381ct;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return AbstractC11060iN.A00(((C1M4) this.A01).A00);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return AbstractC12220kQ.A02(((C1M4) this.A01).A00);
            case 14:
            case 20:
            default:
                return C25361Lq.A00((UserSession) this.A01);
            case Process.SIGTERM /* 15 */:
                return C25361Lq.A00(((C64252vk) this.A01).A00);
            case 16:
                return C3HY.A00(((C25431Lx) this.A01).A04);
            case 17:
                UserSession userSession5 = (UserSession) this.A01;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession5, 36313759509121266L)) {
                    C14360o3.A0B(userSession5, 0);
                    if (C18U.A06(c06090Tz, userSession5, 36317650750346697L)) {
                        interfaceC25441Ly = (C42285Io9) userSession5.A01(C42285Io9.class, new J8V(userSession5, 27));
                    } else {
                        interfaceC25441Ly = (C25431Lx) userSession5.A01(C25431Lx.class, new J8V(userSession5, 30));
                    }
                    c42997Izn = interfaceC25441Ly;
                } else {
                    C14360o3.A0B(userSession5, 0);
                    c42997Izn = new C42997Izn(userSession5, new ConcurrentHashMap());
                }
                return new C25381Ls(c42997Izn);
            case 18:
                return new C3HZ((UserSession) this.A01);
            case Process.SIGSTOP /* 19 */:
                return AbstractC25451Lz.A00(((C3HZ) this.A01).A00);
            case 21:
                return ((InterfaceC16820sZ) this.A01).invoke();
            case 22:
                Object systemService = ((C147416kR) this.A01).A05.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                C14360o3.A0C(systemService, MSV.A00(7));
                return systemService;
            case 23:
                return new C64X() { // from class: X.64W
                    public final C64X A00;
                    public final C64Z A01;

                    @Override // X.C64X
                    public final boolean Ej7() {
                        return false;
                    }

                    @Override // X.C64X
                    public final /* synthetic */ int AzQ() {
                        return 0;
                    }

                    @Override // X.C64X
                    public final /* synthetic */ boolean CQb() {
                        return false;
                    }

                    @Override // X.C64X
                    public final /* synthetic */ boolean CWq() {
                        return false;
                    }

                    @Override // X.C64X
                    public final /* synthetic */ boolean Cah() {
                        return false;
                    }

                    @Override // X.C64X
                    public final /* synthetic */ boolean Cai() {
                        return false;
                    }

                    @Override // X.C64X
                    public final /* synthetic */ boolean EiK() {
                        return true;
                    }

                    {
                        C64Y c64y = C64Y.A00;
                        C14360o3.A07(c64y);
                        this.A01 = c64y;
                        this.A00 = new C1341564a(C41051vD.A01, 0, true);
                    }
                };
            case 24:
                return new C1563670g((UserSession) this.A01);
            case 25:
                return new C1ID((UserSession) this.A01);
            case 26:
                UserSession userSession6 = (UserSession) this.A01;
                C0o0 A002 = AbstractC14350nz.A00();
                A002.A01 = "pending_actions";
                return new C57502kP(C218914p.A08, userSession6, new C18240vB(A002));
            case 27:
                return new OIB((SUPMediaStreamControllerDownloader) ((C37101o8) this.A01).A04.getValue());
            case 28:
                return new C79453gs((UserSession) this.A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new C79353gg(new C57239PbN(this.A01, 14));
            case 30:
                return new BF0(this.A01, 3);
            case 31:
                Interpolator interpolator = C170797jW.A07;
                Context context3 = ((C80593io) this.A01).A01.getContext();
                C170797jW c170797jW = new C170797jW(context3);
                C14360o3.A07(context3);
                c170797jW.A00(AbstractC13880nE.A00(context3, 2.0f));
                c170797jW.A05(context3.getColor(R.color.igds_icon_on_color));
                c170797jW.A02(Paint.Cap.ROUND);
                c170797jW.stop();
                return c170797jW;
            case 32:
                TrialsPreferencesImpl trialsPreferencesImpl = (TrialsPreferencesImpl) this.A01;
                return C1AT.A01(trialsPreferencesImpl.A00).A02(C1AV.A3X, trialsPreferencesImpl.getClass());
            case 33:
                TrialsPreferencesImpl trialsPreferencesImpl2 = (TrialsPreferencesImpl) this.A01;
                return C1AT.A01(trialsPreferencesImpl2.A00).A04(C1AV.A3X, trialsPreferencesImpl2.getClass());
            case 34:
                C53192c1 c53192c1 = new C53192c1((AbstractC12990ll) this.A01);
                C53192c1.A01 = c53192c1;
                return c53192c1;
            case 35:
                View findViewById = ((InterfaceC56392iX) ((C3DP) this.A01).A12.getValue()).getView().findViewById(R.id.background_dimmer);
                findViewById.setAlpha(0.0f);
                AbstractC56952jT.A01(findViewById);
                return findViewById;
            case 36:
                C3DP c3dp = (C3DP) this.A01;
                View findViewById2 = ((InterfaceC56392iX) c3dp.A12.getValue()).getView().findViewById(c3dp.A0r);
                findViewById2.setVisibility(0);
                return findViewById2;
            case 37:
                View view = (View) this.A01;
                View findViewById3 = view.findViewById(R.id.bottom_sheet_container_stub);
                if (findViewById3 == null && (findViewById3 = view.findViewById(R.id.bottom_sheet_container)) == null) {
                    findViewById3 = view;
                }
                return AbstractC56372iV.A00(findViewById3);
            case 38:
                Activity activity = (Activity) this.A01;
                if (AbstractC13180m4.A02(activity)) {
                    View view2 = new View(activity);
                    view2.setVisibility(0);
                    view2.setBackgroundColor(activity.getColor(R.color.black_50_transparent));
                    C57982lB.A0B.A05(activity, new RunnableC24490At9(view2));
                    ((ViewGroup) activity.requireViewById(android.R.id.content)).addView(view2);
                    return view2;
                }
                return null;
            case 39:
                C2V3 c2v3 = C2V3.defaultInstance;
                C65502xm c65502xm = ((AbstractC65902yS) this.A01).A04;
                return C2V3.A00(null, c2v3, null, null, null, null, null, null, -32775, 31, c65502xm.A0W, c65502xm.A0S, false, false, false, false, c65502xm.A0D, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            case 40:
                return new C60539R6c(new ABB((AbstractC65902yS) this.A01));
            case Seq.NULL_REFNUM /* 41 */:
                ((C41L) this.A01).setCurrentPage(0);
                return C0eB.A00;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                UserSession userSession7 = (UserSession) this.A01;
                C14360o3.A0B(userSession7, 0);
                C43001yT c43001yT = (C43001yT) userSession7.A01(C43001yT.class, new C57517Pfr(userSession7, 39));
                if (AbstractC14490oL.A09(AbstractC12290kX.A00)) {
                    c50525MSe = new C50525MSe(true, 3, false, false, false);
                } else {
                    C06090Tz c06090Tz2 = C06090Tz.A05;
                    c50525MSe = new C50525MSe(true, 3, C18U.A06(c06090Tz2, userSession7, 36326189144487656L), C18U.A06(c06090Tz2, userSession7, 36326189144553193L), C18U.A06(c06090Tz2, userSession7, 36326189144618730L));
                }
                return new C42981yQ(c50525MSe, C18950wb.A01, userSession7, c43001yT);
            case 43:
                C1571973y c1571973y = (C1571973y) this.A01;
                UserSession userSession8 = c1571973y.A02;
                AbstractC59962oe abstractC59962oe2 = c1571973y.A01;
                return new C146076i5(abstractC59962oe2, userSession8, abstractC59962oe2.getModuleName());
            case 44:
                return new C129885ts((UserSession) this.A01);
            case 45:
                List list = (List) this.A01;
                if (list != null) {
                    ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((InterfaceC37267GbK) it.next()).F7o());
                    }
                    return arrayList;
                }
                return null;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                InterfaceC104174mf interfaceC104174mf = (InterfaceC104174mf) this.A01;
                if (interfaceC104174mf != null) {
                    return interfaceC104174mf.F7o();
                }
                return null;
            case 47:
                FriendshipStatus friendshipStatus = (FriendshipStatus) this.A01;
                if (friendshipStatus != null) {
                    return friendshipStatus.F7o();
                }
                return null;
            case 48:
                return new C18A((UserSession) this.A01);
            case 49:
                return C1D3.A01.A00(((C18A) this.A01).A00).A00().consistencyService;
        }
    }
}
