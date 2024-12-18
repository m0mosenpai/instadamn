package X;

import android.content.Context;
import android.os.Handler;
import android.text.SpannableString;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.pando.ConnectionManager;
import com.facebook.pando.PandoConsistencyServiceJNI;
import com.facebook.pando.PandoGraphQLConsistencyJNI;
import com.facebook.pando.PandoPaginationService;
import com.facebook.pando.PandoPrimaryExecution;
import com.facebook.tigon.TigonError;
import com.instagram.api.schemas.MetaPlaceDict;
import com.instagram.barcelona.location.api.LocationRepository;
import com.instagram.barcelona.location.model.LocationModel;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.9FP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9FP extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9FP(InterfaceC09390do interfaceC09390do, InterfaceC09390do interfaceC09390do2, InterfaceC09390do interfaceC09390do3, int i) {
        super(0);
        this.A00 = i;
        this.A03 = interfaceC09390do;
        if (32 - i != 0) {
            this.A01 = interfaceC09390do2;
            this.A02 = interfaceC09390do3;
        } else {
            this.A02 = interfaceC09390do2;
            this.A01 = interfaceC09390do3;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v61, types: [X.0YY, X.0sZ] */
    /* JADX WARN: Type inference failed for: r0v94, types: [X.98o, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        View view;
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        InterfaceC09390do interfaceC09390do;
        InterfaceC16660sJ interfaceC16660sJ;
        UUID uuid;
        SpannableString spannableString;
        long j;
        switch (this.A00) {
            case 0:
                C15370ps c15370ps = (C15370ps) this.A01;
                C5AH c5ah = ((C137556Lb) this.A03).A06;
                InterfaceC1128857w interfaceC1128857w = (InterfaceC1128857w) this.A02;
                c15370ps.A00 = c5ah.AMh(interfaceC1128857w, interfaceC1128857w.getLayoutDirection(), interfaceC1128857w.Bxc());
                return C0eB.A00;
            case 1:
                C128385r7 c128385r7 = (C128385r7) this.A03;
                C114205Dh A00 = C128385r7.A00(c128385r7, (InterfaceC1131459c) this.A02, (InterfaceC16820sZ) this.A01);
                if (A00 != null) {
                    C137996Nb c137996Nb = (C137996Nb) c128385r7.A00;
                    long j2 = c137996Nb.A00;
                    if (j2 == 0) {
                        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
                    }
                    return A00.A03(C137996Nb.A01(c137996Nb, A00, j2) ^ (-9223372034707292160L));
                }
                return null;
            case 2:
                view = (View) this.A03;
                onAttachStateChangeListener = (C5TP) this.A01;
                view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
                Object obj = this.A02;
                C14360o3.A0B(obj, 1);
                AbstractC105064oM.A00(view).A00.remove(obj);
                return C0eB.A00;
            case 3:
                view = (View) this.A03;
                onAttachStateChangeListener = (MTP) this.A01;
                view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
                Object obj2 = this.A02;
                C14360o3.A0B(obj2, 1);
                AbstractC105064oM.A00(view).A00.remove(obj2);
                return C0eB.A00;
            case 4:
                C3RT c3rt = (C3RT) this.A02;
                InterfaceC10260gi interfaceC10260gi = c3rt.A00;
                if (interfaceC10260gi != null && interfaceC10260gi.AhA(36317753832117802L) && (c3rt.BUS() == 10 || c3rt.BUS() == 11)) {
                    interfaceC09390do = AbstractC73533Re.A00((Context) this.A01, (UserSession) this.A03).A06;
                } else {
                    AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A03;
                    Object obj3 = this.A01;
                    C14360o3.A0B(abstractC12990ll, 0);
                    C14360o3.A0B(obj3, 1);
                    interfaceC09390do = ((C54742OFt) abstractC12990ll.A01(C54742OFt.class, new C57254Pbc(13, obj3, abstractC12990ll))).A0C;
                }
                return interfaceC09390do.getValue();
            case 5:
                C94G c94g = (C94G) this.A03;
                C3RU c3ru = c94g.A03;
                boolean CbO = c3ru.CbO();
                AbstractC12990ll abstractC12990ll2 = (AbstractC12990ll) this.A02;
                Object obj4 = this.A01;
                if (CbO) {
                    interfaceC16660sJ = null;
                } else {
                    C94N c94n = c94g.A05;
                    long BUS = c3ru.BUS();
                    if (BUS == 1) {
                        interfaceC16660sJ = c94n.A04;
                    } else if (BUS == 2) {
                        interfaceC16660sJ = c94n.A03;
                    } else if (BUS == 53) {
                        interfaceC16660sJ = c94n.A02;
                    } else if (BUS == 54) {
                        interfaceC16660sJ = c94n.A01;
                    } else {
                        interfaceC16660sJ = c94n.A00;
                    }
                }
                C14360o3.A0B(abstractC12990ll2, 0);
                C14360o3.A0B(obj4, 1);
                return ((OFQ) abstractC12990ll2.A01(OFQ.class, new C57261Pbj(14, obj4, interfaceC16660sJ, abstractC12990ll2))).A08.getValue();
            case 6:
                C40831uq c40831uq = (C40831uq) this.A01;
                if (c40831uq != null) {
                    InterfaceC09390do interfaceC09390do2 = (InterfaceC09390do) this.A02;
                    if (interfaceC09390do2 != null) {
                        InterfaceC09390do interfaceC09390do3 = ((C40851us) this.A03).A02;
                        if (interfaceC09390do3 != null) {
                            PandoConsistencyServiceJNI pandoConsistencyServiceJNI = ((PandoGraphQLConsistencyJNI) interfaceC09390do3.getValue()).consistencyService;
                            PandoPrimaryExecution pandoPrimaryExecution = (PandoPrimaryExecution) interfaceC09390do2.getValue();
                            C14360o3.A0B(pandoConsistencyServiceJNI, 0);
                            C14360o3.A0B(pandoPrimaryExecution, 1);
                            XgX xgX = PandoPaginationService.Companion;
                            return new PandoPaginationService(pandoConsistencyServiceJNI, pandoPrimaryExecution, (ConnectionManager) c40831uq.A00.getValue());
                        }
                        throw new IllegalStateException("Consistency service is required for pagination");
                    }
                    throw new IllegalStateException("Primary execution is required for pagination");
                }
                throw new IllegalStateException("Pagination service is required for paginating");
            case 7:
                ((InterfaceC16620sF) ((C0YS) this.A03)).invoke(this.A01, this.A02);
                return C0eB.A00;
            case 8:
                ((C01D) this.A03).A02(this.A01, this.A02);
                return C0eB.A00;
            case 9:
                C1S8.A01((TigonError) this.A01, (InterfaceC74743Xi) this.A02, (C1S8) this.A03);
                return C0eB.A00;
            case 10:
                C1S8.A02((TigonError) this.A01, (InterfaceC74743Xi) this.A02, (C1S8) this.A03);
                return C0eB.A00;
            case 11:
                AnonymousClass142.A02((Context) this.A01, (UserSession) this.A02);
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                InterfaceC132245y2 interfaceC132245y2 = (InterfaceC132245y2) this.A02;
                MetaPlaceDict metaPlaceDict = ((C132235y1) interfaceC132245y2).A01;
                if (metaPlaceDict != null) {
                    AbstractC12990ll abstractC12990ll3 = (AbstractC12990ll) this.A03;
                    C5yI c5yI = (C5yI) this.A01;
                    String id = metaPlaceDict.getId();
                    String str = "";
                    if (id == null) {
                        id = "";
                    }
                    String name = metaPlaceDict.getName();
                    if (name != null) {
                        str = name;
                    }
                    C14360o3.A0B(abstractC12990ll3, 0);
                    ((LocationRepository) abstractC12990ll3.A01(LocationRepository.class, new C50155MDi(abstractC12990ll3, 36))).A00(new LocationModel(null, null, str, null, null, null, null, null, null, null, null, null, Long.parseLong(id)));
                    c5yI.DQK(interfaceC132245y2.Bet().A03, id, str);
                }
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C169597hZ c169597hZ = (C169597hZ) this.A03;
                String str2 = c169597hZ.A04;
                Map map = null;
                if (str2 == null) {
                    return null;
                }
                UserSession userSession = c169597hZ.A03;
                C149766oT c149766oT = new C149766oT(userSession);
                boolean z = c169597hZ.A0D;
                if (z) {
                    boolean z2 = c169597hZ.A09;
                    UserSession userSession2 = c149766oT.A00;
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (z2) {
                        j = 36320279271055616L;
                    } else {
                        j = 36318221981784116L;
                    }
                    if (!C18U.A06(c06090Tz, userSession2, j)) {
                        return str2;
                    }
                }
                C76223bS c76223bS = (C76223bS) this.A02;
                Context context = c76223bS.A05.A0C;
                C14360o3.A07(context);
                boolean z3 = !z;
                List list = c169597hZ.A07;
                if (list == null) {
                    list = C16930sl.A00;
                }
                if (c169597hZ.A0G && !((Boolean) ((C51762Yz) this.A01).A03).booleanValue()) {
                    spannableString = new SpannableString(AbstractC77623dm.A0F(c76223bS, 2131954793));
                } else {
                    spannableString = null;
                }
                if (c169597hZ.A0E) {
                    map = c169597hZ.A08;
                }
                return C169607ha.A00(context, spannableString, userSession, str2, list, map, new D8L(46, this.A01, c169597hZ), new C50368MLv(c169597hZ, 39), new C50368MLv(c169597hZ, 40), new C30480DbP(c169597hZ, 43), new C30485DbU(17, c76223bS, c169597hZ), R.attr.igds_color_link, z3, false, false);
            case 14:
                C167217da c167217da = (C167217da) this.A03;
                InterfaceC166347c3 interfaceC166347c3 = c167217da.A03;
                if (interfaceC166347c3 instanceof C166337c2) {
                    InterfaceC166277bw interfaceC166277bw = ((C166337c2) interfaceC166347c3).A03;
                    if (interfaceC166277bw instanceof C167827ec) {
                        C167247dd c167247dd = (C167247dd) this.A02;
                        C167827ec c167827ec = (C167827ec) interfaceC166277bw;
                        uuid = c167827ec.A02;
                        C14360o3.A0B(uuid, 0);
                        boolean z4 = !uuid.equals(c167247dd.A00);
                        c167247dd.A00 = uuid;
                        if (z4) {
                            try {
                                C168127f7 c168127f7 = (C168127f7) this.A01;
                                RecyclerView A002 = c168127f7.A00();
                                if (c167827ec.A03 && A002 != null) {
                                    C011504d A003 = AbstractC009003e.A00(A002);
                                    if (A003 != null && A003.A00.A0I(8)) {
                                        c168127f7.A03(C05F.A0N, c167827ec.A01);
                                    } else {
                                        A002.addOnLayoutChangeListener(new LQD(0, c168127f7, A002, interfaceC166277bw));
                                    }
                                } else {
                                    c168127f7.A03(C05F.A0N, c167827ec.A01);
                                }
                            } catch (IllegalArgumentException unused) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(AbstractC43591JPw.A00(620));
                                sb.append(interfaceC166277bw);
                                C0K8.A0C(AbstractC43591JPw.A00(567), sb.toString());
                            }
                        }
                    } else if (interfaceC166277bw instanceof C167837ed) {
                        C167247dd c167247dd2 = (C167247dd) this.A02;
                        uuid = ((C167837ed) interfaceC166277bw).A00;
                        C14360o3.A0B(uuid, 0);
                        boolean z5 = !uuid.equals(c167247dd2.A00);
                        c167247dd2.A00 = uuid;
                        if (z5) {
                            RecyclerView A004 = ((C168127f7) this.A01).A00();
                            if (A004 != null) {
                                A004.A0o(0);
                            }
                        }
                    } else if (!C14360o3.A0K(interfaceC166277bw, C166267bv.A00)) {
                        throw new RuntimeException();
                    }
                    c167217da.A02.A0k(uuid);
                }
                return new C79353gg(new C0YY(0));
            case Process.SIGTERM /* 15 */:
                AbstractC168537fn abstractC168537fn = ((C170327il) this.A03).A00.A04;
                if (abstractC168537fn instanceof C168527fm) {
                    return null;
                }
                if (abstractC168537fn instanceof C170317ik) {
                    C76223bS c76223bS2 = (C76223bS) this.A02;
                    return new A87((C2XI) this.A01, AbstractC77623dm.A02(c76223bS2, R.attr.highlightedOrWarningCommentBackground), AbstractC77623dm.A02(c76223bS2, R.attr.highlightedOrWarningCommentBackgroundTransitionEnd));
                }
                throw new RuntimeException();
            case 16:
                InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) C11Q.A00();
                final C1IK c1ik = (C1IK) this.A02;
                final C62362sb c62362sb = (C62362sb) this.A01;
                interfaceC16660sJ2.invoke(new Runnable() { // from class: X.2sc
                    @Override // java.lang.Runnable
                    public final void run() {
                        c1ik.unlock();
                        C62362sb c62362sb2 = c62362sb;
                        if (c62362sb2 != null && C14360o3.A0K(c62362sb2.A00, "main_feed")) {
                            C226418s A01 = C226218q.A01(AbstractC12960li.A00);
                            A01.A0P(A01.A02, "FEED_REQUEST_ON_REPLAY_METHOD_END");
                        }
                    }
                });
                return C0eB.A00;
            case 17:
                View view2 = (View) this.A01;
                C198768qZ c198768qZ = (C198768qZ) this.A03;
                return new C198818qe(view2, c198768qZ.A03, (TargetViewSizeProvider) this.A02, (C87y) c198768qZ.A09.getValue(), new C198798qc(c198768qZ));
            case 18:
                AbstractC59962oe abstractC59962oe = ((C190248bi) this.A03).A02;
                C14360o3.A0C(abstractC59962oe, "null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
                final C23031Ai c23031Ai = (C23031Ai) this.A01;
                final UserSession userSession3 = (UserSession) this.A02;
                return new C52942bb(new AbstractC61132qb(c23031Ai, userSession3) { // from class: X.8bl
                    public final UserSession A00;
                    public final C23031Ai A01;

                    {
                        C14360o3.A0B(c23031Ai, 1);
                        C14360o3.A0B(userSession3, 2);
                        this.A01 = c23031Ai;
                        this.A00 = userSession3;
                    }

                    @Override // X.AbstractC61132qb
                    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
                        return new C190288bm(this.A01, this.A00);
                    }
                }, abstractC59962oe).A00(C190288bm.class);
            case Process.SIGSTOP /* 19 */:
                C006802i c006802i = (C006802i) this.A01;
                C14360o3.A0A(c006802i);
                return new C183348Bh((C1QT) this.A03, (C24Q) this.A02, c006802i);
            case 20:
                C7XQ c7xq = (C7XQ) this.A03;
                UserSession userSession4 = c7xq.A0G;
                AbstractC59962oe abstractC59962oe2 = c7xq.A0E;
                C7VF c7vf = (C7VF) this.A01;
                C7WZ c7wz = c7xq.A0H;
                C163867Va c163867Va = c7wz.A06;
                C7XY c7xy = new C7XY(c7wz.A0G);
                C7XY c7xy2 = new C7XY(c7xq.A0t);
                C7XY c7xy3 = new C7XY(c7wz.A0I);
                final C7VU c7vu = (C7VU) this.A02;
                return new C164497Xo(abstractC59962oe2, userSession4, c163867Va, new C7X0() { // from class: X.7Xn
                    @Override // X.C7X0
                    public final /* bridge */ /* synthetic */ Object get() {
                        return C7VU.this;
                    }
                }, c7vf, c7xy, c7xy2, c7xy3);
            case 21:
                C7XQ c7xq2 = (C7XQ) this.A03;
                AbstractC59962oe abstractC59962oe3 = c7xq2.A0E;
                UserSession userSession5 = c7xq2.A0G;
                C7WZ c7wz2 = c7xq2.A0H;
                InterfaceC11380iw interfaceC11380iw = c7wz2.A02;
                String str3 = c7wz2.A09;
                return new C7YB(abstractC59962oe3, interfaceC11380iw, userSession5, (C7W2) this.A02, (C7VS) this.A01, c7wz2.A07, str3, c7xq2.A0t, c7wz2.A0H, new C50249MHe(c7xq2, 31));
            case 22:
                C7XQ c7xq3 = (C7XQ) this.A03;
                UserSession userSession6 = c7xq3.A0G;
                AbstractC59962oe abstractC59962oe4 = c7xq3.A0E;
                Handler handler = (Handler) this.A02;
                C7XY c7xy4 = new C7XY(c7xq3.A0t);
                AnonymousClass983 anonymousClass983 = (AnonymousClass983) this.A01;
                C7WZ c7wz3 = c7xq3.A0H;
                C7XZ c7xz = new C7XZ(c7wz3.A0K);
                C7XZ c7xz2 = new C7XZ(c7wz3.A0L);
                C14360o3.A0B(abstractC59962oe4, 1);
                C14360o3.A0B(handler, 2);
                C14360o3.A0B(anonymousClass983, 4);
                return new C164477Xm(handler, userSession6, C13920nI.A00, anonymousClass983, new C2056598p(userSession6, new Object()), AbstractC164377Xa.A00(userSession6), c7xz, c7xz2, new WeakReference(abstractC59962oe4), c7xy4);
            case 23:
                return new C23916Aij((InterfaceC11380iw) this.A01, ((AnonymousClass982) this.A03).A01, (InterfaceC08830cm) this.A02);
            case 24:
                return new C1578676u((Fragment) this.A02, ((AnonymousClass982) this.A03).A01, ((C7XQ) this.A01).A00());
            case 25:
                return new AnonymousClass770(((AnonymousClass982) this.A03).A01, (InterfaceC08830cm) this.A01, (InterfaceC08830cm) this.A02);
            case 26:
                AnonymousClass982 anonymousClass982 = (AnonymousClass982) this.A03;
                return new G4Q(anonymousClass982.A00.requireActivity(), (InterfaceC11380iw) this.A01, anonymousClass982.A01, (C7WA) this.A02, C3G2.A0a);
            case 27:
                AnonymousClass982 anonymousClass9822 = (AnonymousClass982) this.A03;
                return new G4I(anonymousClass9822.A00.requireActivity(), anonymousClass9822.A01, ((C7XQ) this.A01).A00(), (C163867Va) this.A02);
            case 28:
                return new WjS((AbstractC59962oe) this.A02, ((AnonymousClass982) this.A03).A01, (InterfaceC08830cm) this.A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C4FE c4fe = (C4FE) this.A03;
                UserSession userSession7 = c4fe.A02;
                C135976Dc A01 = AbstractC135966Db.A01(userSession7);
                C4F5 c4f5 = (C4F5) this.A02;
                EnumC152696tw enumC152696tw = EnumC152696tw.BIRTHDAY_INDICATOR;
                A01.A0K(enumC152696tw, c4f5);
                boolean A0K = C14360o3.A0K(userSession7.userId, c4f5.A0A.getId());
                C4F8 c4f8 = c4fe.A05;
                if (A0K) {
                    AbstractC46774KmV.A00(c4f8.A01, c4f8.A03);
                } else {
                    c4f8.A01(enumC152696tw, c4f5);
                }
                return C0eB.A00;
            case 30:
                C7MW c7mw = (C7MW) this.A03;
                return new AbstractC162927Rd((C7RX) ((InterfaceC09390do) this.A01).getValue(), new C49126Lo5(c7mw.A08, c7mw.A09, (C158907Bc) ((InterfaceC09390do) this.A02).getValue()));
            case 31:
                C7MW c7mw2 = (C7MW) this.A03;
                UserSession userSession8 = c7mw2.A07;
                C7ZX c7zx = c7mw2.A08;
                C158907Bc c158907Bc = (C158907Bc) ((InterfaceC09390do) this.A02).getValue();
                C7RX c7rx = (C7RX) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0B(c158907Bc, 2);
                C14360o3.A0B(c7rx, 3);
                return new AbstractC162927Rd(c7rx, new C49128Lo7(userSession8, c7zx, c158907Bc));
            case 32:
                return new AbstractC1584479e((C79Z) ((InterfaceC09390do) this.A01).getValue(), (C158907Bc) ((InterfaceC09390do) this.A03).getValue(), (C49127Lo6) ((InterfaceC09390do) this.A02).getValue());
            case 33:
                C7MW c7mw3 = (C7MW) this.A03;
                return new AbstractC1584479e((C79Z) ((InterfaceC09390do) this.A01).getValue(), C158907Bc.A00(c7mw3.A08, c7mw3.A09), (C1579977j) ((InterfaceC09390do) this.A02).getValue());
            case 34:
            case 35:
            default:
                return new C45889KSs((C7RX) ((InterfaceC09390do) this.A01).getValue(), (C49037LmP) ((InterfaceC09390do) this.A02).getValue(), (C49119Lnw) ((InterfaceC09390do) this.A03).getValue(), KV7.class);
            case 36:
                return new C45889KSs((C7RX) ((InterfaceC09390do) this.A01).getValue(), (C49037LmP) ((InterfaceC09390do) this.A02).getValue(), (C49119Lnw) ((InterfaceC09390do) this.A03).getValue(), KV6.class);
            case 37:
                return new C45888KSr((C7RX) ((InterfaceC09390do) this.A01).getValue(), (C49037LmP) ((InterfaceC09390do) this.A02).getValue(), (C49119Lnw) ((InterfaceC09390do) this.A03).getValue());
            case 38:
                C7MW c7mw4 = (C7MW) this.A03;
                UserSession userSession9 = c7mw4.A07;
                C7ZX c7zx2 = c7mw4.A08;
                AnonymousClass988 anonymousClass988 = c7mw4.A09;
                C79Z c79z = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.voice.VoiceContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.quotedreply.expandabletext.ExpandableTextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                C7DK c7dk = (C7DK) this.A02;
                C14360o3.A0B(c79z, 3);
                C14360o3.A0B(c7dk, 4);
                return new AbstractC1584479e(c79z, new C1579977j(userSession9, c7zx2, anonymousClass988, c7dk, false, false), new C79T(userSession9, c7zx2, anonymousClass988));
            case 39:
                C7MW c7mw5 = (C7MW) this.A03;
                Context context2 = c7mw5.A04;
                UserSession userSession10 = c7mw5.A07;
                C7ZX c7zx3 = c7mw5.A08;
                AnonymousClass988 anonymousClass9882 = c7mw5.A09;
                C79Z c79z2 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z2, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.voice.VoiceContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                C7DK c7dk2 = (C7DK) this.A02;
                InterfaceC11380iw interfaceC11380iw2 = c7mw5.A06;
                C14360o3.A0B(c79z2, 4);
                C14360o3.A0B(c7dk2, 5);
                C14360o3.A0B(interfaceC11380iw2, 6);
                return new AbstractC1584479e(c79z2, new C1579977j(userSession10, c7zx3, anonymousClass9882, c7dk2, false, false), new C1586479z(context2, interfaceC11380iw2, userSession10, c7zx3, anonymousClass9882));
            case 40:
                C7MW c7mw6 = (C7MW) this.A03;
                UserSession userSession11 = c7mw6.A07;
                C7ZX c7zx4 = c7mw6.A08;
                AnonymousClass988 anonymousClass9883 = c7mw6.A09;
                C79Z c79z3 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z3, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.voice.VoiceContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder>");
                C7DK c7dk3 = (C7DK) this.A02;
                InterfaceC11380iw interfaceC11380iw3 = c7mw6.A06;
                C14360o3.A0B(c79z3, 3);
                C14360o3.A0B(c7dk3, 4);
                C14360o3.A0B(interfaceC11380iw3, 5);
                return new AbstractC1584479e(c79z3, new C1579977j(userSession11, c7zx4, anonymousClass9883, c7dk3, false, false), A0Z.A00(interfaceC11380iw3, userSession11, c7zx4, anonymousClass9883));
            case Seq.NULL_REFNUM /* 41 */:
                C7MW c7mw7 = (C7MW) this.A03;
                UserSession userSession12 = c7mw7.A07;
                C7ZX c7zx5 = c7mw7.A08;
                AnonymousClass988 anonymousClass9884 = c7mw7.A09;
                C79Z c79z4 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z4, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.voice.VoiceContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.voice.VoiceContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                C7DK c7dk4 = (C7DK) this.A02;
                C14360o3.A0B(c79z4, 3);
                C14360o3.A0B(c7dk4, 4);
                return new AbstractC1584479e(c79z4, new C1579977j(userSession12, c7zx5, anonymousClass9884, c7dk4, false, false), new C1579977j(userSession12, c7zx5, anonymousClass9884, c7dk4, false, false));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C7MW c7mw8 = (C7MW) this.A03;
                UserSession userSession13 = c7mw8.A07;
                C7ZX c7zx6 = c7mw8.A08;
                AnonymousClass988 anonymousClass9885 = c7mw8.A09;
                C79Z c79z5 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z5, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.voice.VoiceContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.visual.VisualContentViewHolder>");
                InterfaceC11380iw interfaceC11380iw4 = c7mw8.A06;
                C7DK c7dk5 = (C7DK) this.A02;
                C14360o3.A0B(c79z5, 3);
                C14360o3.A0B(interfaceC11380iw4, 4);
                C14360o3.A0B(c7dk5, 5);
                return new AbstractC1584479e(c79z5, new C1579977j(userSession13, c7zx6, anonymousClass9885, c7dk5, false, false), new C7RY(interfaceC11380iw4, userSession13, c7zx6, anonymousClass9885));
            case 43:
                C7MW c7mw9 = (C7MW) this.A03;
                UserSession userSession14 = c7mw9.A07;
                C7ZX c7zx7 = c7mw9.A08;
                AnonymousClass988 anonymousClass9886 = c7mw9.A09;
                C79Z c79z6 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z6, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.voice.VoiceContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                InterfaceC11380iw interfaceC11380iw5 = c7mw9.A06;
                C7DK c7dk6 = (C7DK) this.A02;
                C14360o3.A0B(c79z6, 3);
                C14360o3.A0B(interfaceC11380iw5, 4);
                C14360o3.A0B(c7dk6, 5);
                return new AbstractC1584479e(c79z6, new C1579977j(userSession14, c7zx7, anonymousClass9886, c7dk6, false, false), new C7T9(interfaceC11380iw5, userSession14, c7zx7, anonymousClass9886));
            case 44:
                C7MW c7mw10 = (C7MW) this.A03;
                Context context3 = c7mw10.A04;
                UserSession userSession15 = c7mw10.A07;
                C7ZX c7zx8 = c7mw10.A08;
                AnonymousClass988 anonymousClass9887 = c7mw10.A09;
                C79Z c79z7 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z7, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.voice.VoiceContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                InterfaceC11380iw interfaceC11380iw6 = c7mw10.A06;
                C7DK c7dk7 = (C7DK) this.A02;
                C14360o3.A0B(c79z7, 4);
                C14360o3.A0B(interfaceC11380iw6, 5);
                C14360o3.A0B(c7dk7, 6);
                return new AbstractC1584479e(c79z7, new C1586479z(context3, interfaceC11380iw6, userSession15, c7zx8, anonymousClass9887), new C1579977j(userSession15, c7zx8, anonymousClass9887, c7dk7, false, false));
            case 45:
                C7MW c7mw11 = (C7MW) this.A03;
                Context context4 = c7mw11.A04;
                UserSession userSession16 = c7mw11.A07;
                C7ZX c7zx9 = c7mw11.A08;
                AnonymousClass988 anonymousClass9888 = c7mw11.A09;
                C79Z c79z8 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z8, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.gif.GifContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                InterfaceC11380iw interfaceC11380iw7 = c7mw11.A06;
                C163547Tr c163547Tr = (C163547Tr) this.A02;
                C14360o3.A0B(c79z8, 4);
                C14360o3.A0B(interfaceC11380iw7, 5);
                C14360o3.A0B(c163547Tr, 6);
                return new AbstractC1584479e(c79z8, new C1586479z(context4, interfaceC11380iw7, userSession16, c7zx9, anonymousClass9888), AbstractC22707A0d.A00(userSession16, c7zx9, c163547Tr, anonymousClass9888));
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C7MW c7mw12 = (C7MW) this.A03;
                UserSession userSession17 = c7mw12.A07;
                C7ZX c7zx10 = c7mw12.A08;
                AnonymousClass988 anonymousClass9889 = c7mw12.A09;
                C79Z c79z9 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z9, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visual.VisualContentViewHolder, com.instagram.direct.messagethread.voice.VoiceContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                C7DK c7dk8 = (C7DK) this.A02;
                InterfaceC11380iw interfaceC11380iw8 = c7mw12.A06;
                C14360o3.A0B(c79z9, 3);
                C14360o3.A0B(c7dk8, 4);
                C14360o3.A0B(interfaceC11380iw8, 5);
                return new AbstractC1584479e(c79z9, new C7RY(interfaceC11380iw8, userSession17, c7zx10, anonymousClass9889), new C1579977j(userSession17, c7zx10, anonymousClass9889, c7dk8, false, false));
            case 47:
                C7MW c7mw13 = (C7MW) this.A03;
                UserSession userSession18 = c7mw13.A07;
                C7ZX c7zx11 = c7mw13.A08;
                AnonymousClass988 anonymousClass98810 = c7mw13.A09;
                C79Z c79z10 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z10, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visual.VisualContentViewHolder, com.instagram.direct.messagethread.gif.GifContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                InterfaceC11380iw interfaceC11380iw9 = c7mw13.A06;
                C163547Tr c163547Tr2 = (C163547Tr) this.A02;
                C14360o3.A0B(c79z10, 3);
                C14360o3.A0B(interfaceC11380iw9, 4);
                C14360o3.A0B(c163547Tr2, 5);
                return new AbstractC1584479e(c79z10, new C7RY(interfaceC11380iw9, userSession18, c7zx11, anonymousClass98810), AbstractC22707A0d.A00(userSession18, c7zx11, c163547Tr2, anonymousClass98810));
            case 48:
                C7MW c7mw14 = (C7MW) this.A03;
                UserSession userSession19 = c7mw14.A07;
                C7ZX c7zx12 = c7mw14.A08;
                AnonymousClass988 anonymousClass98811 = c7mw14.A09;
                C79Z c79z11 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z11, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.voice.VoiceContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                C7DK c7dk9 = (C7DK) this.A02;
                InterfaceC11380iw interfaceC11380iw10 = c7mw14.A06;
                C14360o3.A0B(c79z11, 3);
                C14360o3.A0B(c7dk9, 4);
                C14360o3.A0B(interfaceC11380iw10, 5);
                return new AbstractC1584479e(c79z11, new C7T9(interfaceC11380iw10, userSession19, c7zx12, anonymousClass98811), new C1579977j(userSession19, c7zx12, anonymousClass98811, c7dk9, false, false));
            case 49:
                C7MW c7mw15 = (C7MW) this.A03;
                UserSession userSession20 = c7mw15.A07;
                C7ZX c7zx13 = c7mw15.A08;
                AnonymousClass988 anonymousClass98812 = c7mw15.A09;
                C79Z c79z12 = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z12, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.gif.GifContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                InterfaceC11380iw interfaceC11380iw11 = c7mw15.A06;
                C163547Tr c163547Tr3 = (C163547Tr) this.A02;
                C14360o3.A0B(c79z12, 3);
                C14360o3.A0B(interfaceC11380iw11, 4);
                C14360o3.A0B(c163547Tr3, 5);
                return new AbstractC1584479e(c79z12, new C7T9(interfaceC11380iw11, userSession20, c7zx13, anonymousClass98812), AbstractC22707A0d.A00(userSession20, c7zx13, c163547Tr3, anonymousClass98812));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9FP(int i, Object obj, Object obj2, Object obj3) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }
}
