package com.instagram.creation.activity;

import X.A0R;
import X.AbstractC08820cl;
import X.AbstractC116275Og;
import X.AbstractC12120kG;
import X.AbstractC12990ll;
import X.AbstractC13530mf;
import X.AbstractC13600mm;
import X.AbstractC15860qg;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC173457nx;
import X.AbstractC173537o5;
import X.AbstractC18680vv;
import X.AbstractC197358o6;
import X.AbstractC209399Nx;
import X.AbstractC23048AEe;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC25651Mw;
import X.AbstractC31171DnF;
import X.AbstractC31177DnL;
import X.AbstractC31178DnM;
import X.AbstractC31718DwN;
import X.AbstractC43591JPw;
import X.AbstractC43593JPy;
import X.AbstractC43847JaB;
import X.AbstractC44068Jdt;
import X.AbstractC50522MSa;
import X.AbstractC50666MYj;
import X.AbstractC50694MZo;
import X.AbstractC50722MaN;
import X.AbstractC52490NKi;
import X.AbstractC53930Nt3;
import X.AbstractC54246NyR;
import X.AbstractC54875OOn;
import X.AbstractC59962oe;
import X.AbstractC916948n;
import X.AnonymousClass229;
import X.AnonymousClass249;
import X.AnonymousClass257;
import X.AnonymousClass840;
import X.AnonymousClass841;
import X.C05F;
import X.C06090Tz;
import X.C06N;
import X.C06P;
import X.C0f9;
import X.C131965xW;
import X.C14360o3;
import X.C173557o7;
import X.C1810981l;
import X.C196068lw;
import X.C218914p;
import X.C22P;
import X.C25671My;
import X.C25A;
import X.C2U7;
import X.C2d5;
import X.C3KD;
import X.C3KF;
import X.C3KH;
import X.C3KI;
import X.C3KJ;
import X.C3O0;
import X.C3OO;
import X.C40121td;
import X.C41451vu;
import X.C43878Jai;
import X.C44059Jdk;
import X.C45757KNk;
import X.C47Z;
import X.C50693MZn;
import X.C50695MZq;
import X.C50698MZt;
import X.C50699MZu;
import X.C50713MaC;
import X.C52491NKj;
import X.C52492NKk;
import X.C52493NKm;
import X.C52494NKn;
import X.C52495NKo;
import X.C52496NKp;
import X.C52498NKr;
import X.C52499NKs;
import X.C52500NKt;
import X.C52501NKu;
import X.C52502NKv;
import X.C52503NKw;
import X.C52504NKx;
import X.C52506NKz;
import X.C55W;
import X.C56024Otv;
import X.C56035Ou7;
import X.C56036Ou8;
import X.C5L6;
import X.C7FH;
import X.C8M4;
import X.C9GR;
import X.EnumC69983Ch;
import X.InterfaceC02590Ai;
import X.InterfaceC12870lZ;
import X.InterfaceC15850qf;
import X.InterfaceC189598ae;
import X.InterfaceC189608af;
import X.InterfaceC189628ah;
import X.InterfaceC189648aj;
import X.InterfaceC189678am;
import X.InterfaceC197218ns;
import X.InterfaceC41501vz;
import X.InterfaceC50446MPa;
import X.InterfaceC50451MPf;
import X.InterfaceC57810Pkc;
import X.InterfaceC57821Pkn;
import X.InterfaceC57868PlY;
import X.InterfaceC57929PmZ;
import X.InterfaceC58029PoF;
import X.InterfaceC58030PoG;
import X.InterfaceC58286Pse;
import X.KK4;
import X.MN3;
import X.MQT;
import X.MSW;
import X.MSX;
import X.MX5;
import X.MXA;
import X.MXB;
import X.NKl;
import X.NL0;
import X.NL1;
import X.NL2;
import X.NL3;
import X.NL4;
import X.NL5;
import X.NL6;
import X.NL7;
import X.NL8;
import X.NL9;
import X.NLA;
import X.NLB;
import X.NLC;
import X.NLD;
import X.NLE;
import X.O2L;
import X.OJQ;
import X.OL6;
import X.OXt;
import X.RunnableC56976PPr;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.PointF;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.base.VideoSession;
import com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.creation.state.CreationState;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.user.model.UpcomingEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/* loaded from: classes9.dex */
public class MediaCaptureActivity extends IgFragmentActivity implements InterfaceC189598ae, InterfaceC12870lZ, InterfaceC189608af, C2d5, InterfaceC189628ah, InterfaceC41501vz, InterfaceC58286Pse, InterfaceC58030PoG, MQT, InterfaceC50446MPa, InterfaceC50451MPf, InterfaceC189648aj, InterfaceC58029PoF, InterfaceC189678am, InterfaceC57810Pkc, MN3, InterfaceC57821Pkn, InterfaceC57868PlY {
    public static final CallerContext A0U = CallerContext.A01("MediaCaptureActivity");
    public C06N A00;
    public AbstractC59962oe A03;
    public UserSession A04;
    public C56036Ou8 A05;
    public CreationSession A06;
    public MXB A07;
    public MXA A08;
    public AnonymousClass840 A09;
    public C50693MZn A0A;
    public C40121td A0B;
    public boolean A0C;
    public View A0D;
    public C3O0 A0F;
    public UpcomingEvent A0G;
    public String A0I;
    public ArrayList A0J;
    public final Map A0N = AbstractC166987dD.A1G();
    public final Set A0T = AbstractC166987dD.A1H();
    public final List A0M = AbstractC166987dD.A1E();
    public C1810981l A0E = null;
    public OJQ A02 = null;
    public C22P A01 = C22P.A5N;
    public Boolean A0H = null;
    public boolean A0K = false;
    public boolean A0L = false;
    public final InterfaceC41501vz A0R = C56035Ou7.A00(this, 16);
    public final InterfaceC41501vz A0S = C56035Ou7.A00(this, 17);
    public final InterfaceC41501vz A0P = C56035Ou7.A00(this, 18);
    public final InterfaceC41501vz A0Q = C56035Ou7.A00(this, 19);
    public final InterfaceC41501vz A0O = C56035Ou7.A00(this, 20);

    @Override // X.InterfaceC58030PoG
    public final /* synthetic */ void AGo() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0047, code lost:
    
        if (r0.A04 == false) goto L9;
     */
    @Override // X.InterfaceC50446MPa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cs4(X.C47Z r13) {
        /*
            r12 = this;
            r3 = r12
            android.content.Context r1 = r12.getApplicationContext()
            com.instagram.common.session.UserSession r0 = r12.A04
            X.AbstractC167017dG.A1N(r1, r0)
            X.2Pt r1 = X.C2Ps.A00(r1, r0)
            com.instagram.pendingmedia.model.ClipInfo r0 = r13.A1N
            java.lang.String r0 = r0.A0F
            r0.getClass()
            java.io.File r0 = X.AbstractC166987dD.A11(r0)
            java.io.File r2 = X.AMc.A00(r1, r0)
            com.instagram.common.session.UserSession r5 = r12.A04
            r1 = 0
            r0 = 3
            com.instagram.common.gallery.Medium r0 = X.C8IU.A03(r2, r0, r1)
            java.util.List r10 = X.AbstractC166987dD.A1J(r0)
            com.instagram.creation.base.CreationSession r0 = X.MX5.A00(r12)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r7 = r0.A0B
            java.lang.String r8 = r12.A0I
            java.util.ArrayList r0 = r12.A0J
            if (r0 == 0) goto L4e
            java.lang.Object r9 = r0.get(r1)
            java.lang.String r9 = (java.lang.String) r9
        L3b:
            X.22P r4 = r12.A01
            r6 = 0
            com.instagram.creation.base.CreationSession r0 = r12.A06
            com.instagram.model.creation.MediaCaptureConfig r0 = r0.A09
            if (r0 == 0) goto L49
            boolean r0 = r0.A04
            r11 = 1
            if (r0 != 0) goto L4a
        L49:
            r11 = 0
        L4a:
            X.AbstractC86593tX.A0L(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L4e:
            r9 = 0
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.activity.MediaCaptureActivity.Cs4(X.47Z):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r2.A0B(r1) != false) goto L8;
     */
    @Override // X.InterfaceC58029PoF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CwH(boolean r16, boolean r17, boolean r18) {
        /*
            r15 = this;
            r3 = r15
            X.MXB r2 = r15.A07
            if (r2 == 0) goto L18
            java.lang.Integer r1 = X.C05F.A01
            boolean r0 = r2.A0B(r1)
            if (r0 != 0) goto L15
            java.lang.Integer r1 = X.C05F.A0D
            boolean r0 = r2.A0B(r1)
            if (r0 == 0) goto L18
        L15:
            r2.A08(r1)
        L18:
            com.instagram.common.session.UserSession r4 = r15.A04
            X.841 r6 = X.MSX.A0L(r15)
            X.1td r8 = r15.A0B
            X.MXB r5 = r15.A07
            r14 = 0
            X.PUd r10 = new X.PUd
            r1 = r18
            r10.<init>(r14, r15, r1)
            r0 = 1
            X.PUd r11 = new X.PUd
            r11.<init>(r0, r15, r1)
            java.lang.String r9 = "MediaCaptureActivity"
            r12 = r16
            r13 = r17
            r7 = r15
            X.AbstractC55032OXr.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.activity.MediaCaptureActivity.CwH(boolean, boolean, boolean):void");
    }

    @Override // X.MQT
    public final /* synthetic */ void D8k(int i, int i2) {
    }

    @Override // X.MQT
    public final void DH8(Location location, Uri uri, MediaUploadMetadata mediaUploadMetadata, CropInfo cropInfo, String str, String str2, HashMap hashMap, int i, int i2) {
        A02(location, uri, mediaUploadMetadata, this, cropInfo, str, null, null, str2, null, null, null, null, null, hashMap, i, i2);
    }

    @Override // X.InterfaceC189648aj
    public final void ELe(boolean z) {
        this.A0L = true;
        EDa(new RunnableC56976PPr(this, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A01(android.content.Intent r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.activity.MediaCaptureActivity.A01(android.content.Intent, java.lang.String, boolean):void");
    }

    private void A07(CreationState[] creationStateArr) {
        if (this.A0A == null) {
            C50693MZn c50693MZn = new C50693MZn(this.A04, creationStateArr);
            this.A0A = c50693MZn;
            UserSession userSession = this.A04;
            this.A05 = new C56036Ou8(getSupportFragmentManager(), this.A01, userSession, this, this.A09, this.A0G);
            CreationState creationState = CreationState.A0E;
            CreationState creationState2 = CreationState.A0R;
            c50693MZn.A02(creationState, creationState2, NLD.class);
            CreationState creationState3 = CreationState.A0F;
            c50693MZn.A02(creationState, creationState3, C52504NKx.class);
            c50693MZn.A02(creationState3, creationState2, NLD.class);
            CreationState creationState4 = CreationState.A02;
            c50693MZn.A02(creationState2, creationState4, C52503NKw.class);
            CreationState creationState5 = CreationState.A0W;
            c50693MZn.A02(creationState2, creationState5, C52501NKu.class);
            CreationState creationState6 = CreationState.A0J;
            c50693MZn.A02(creationState2, creationState6, NL8.class);
            c50693MZn.A02(creationState6, creationState2, NLD.class);
            c50693MZn.A02(creationState, creationState5, C52499NKs.class);
            CreationState creationState7 = CreationState.A0P;
            c50693MZn.A02(creationState, creationState7, C45757KNk.class);
            c50693MZn.A02(creationState7, creationState5, C52499NKs.class);
            CreationState creationState8 = CreationState.A0c;
            c50693MZn.A02(creationState, creationState8, NLC.class);
            c50693MZn.A02(CreationState.A0b, creationState8, NLC.class);
            c50693MZn.A02(creationState8, creationState4, C52503NKw.class);
            c50693MZn.A02(creationState8, creationState5, C52501NKu.class);
            c50693MZn.A02(CreationState.A0T, creationState8, NLC.class);
            CreationState creationState9 = CreationState.A04;
            c50693MZn.A02(creationState, creationState9, NLB.class);
            c50693MZn.A02(creationState6, creationState9, NLB.class);
            c50693MZn.A02(creationState9, creationState2, NLE.class);
            c50693MZn.A02(creationState9, creationState8, NL9.class);
            c50693MZn.A02(creationState9, creationState5, C52501NKu.class);
            c50693MZn.A02(creationState9, creationState6, NL8.class);
            c50693MZn.A02(creationState9, creationState4, C52503NKw.class);
            CreationState creationState10 = CreationState.A0H;
            c50693MZn.A02(creationState10, creationState2, NLE.class);
            c50693MZn.A02(creationState10, creationState8, NL9.class);
            c50693MZn.A02(creationState10, creationState5, C52501NKu.class);
            c50693MZn.A02(creationState10, creationState4, C52503NKw.class);
            CreationState creationState11 = CreationState.A0I;
            c50693MZn.A02(creationState11, creationState5, C52501NKu.class);
            c50693MZn.A02(creationState11, creationState4, C52503NKw.class);
            CreationState creationState12 = CreationState.A0N;
            c50693MZn.A02(creationState5, creationState12, NL2.class);
            c50693MZn.A02(creationState5, CreationState.A0K, AbstractC52490NKi.class);
            c50693MZn.A02(creationState5, CreationState.A0C, NL0.class);
            c50693MZn.A02(creationState5, CreationState.A0D, NL1.class);
            c50693MZn.A02(creationState5, CreationState.A0U, C52502NKv.class);
            CreationState creationState13 = CreationState.A0Y;
            c50693MZn.A02(creationState5, creationState13, NL3.class);
            CreationState creationState14 = CreationState.A0Z;
            c50693MZn.A02(creationState5, creationState14, NL5.class);
            c50693MZn.A02(creationState13, creationState14, NL5.class);
            CreationState creationState15 = CreationState.A0V;
            c50693MZn.A02(creationState15, creationState13, NL3.class);
            c50693MZn.A02(creationState15, creationState14, NL5.class);
            CreationState creationState16 = CreationState.A03;
            c50693MZn.A02(creationState5, creationState16, NL7.class);
            c50693MZn.A02(creationState5, creationState15, NL4.class);
            c50693MZn.A02(creationState5, CreationState.A0G, C52498NKr.class);
            CreationState creationState17 = CreationState.A0A;
            c50693MZn.A02(creationState17, CreationState.A06, C52491NKj.class);
            CreationState creationState18 = CreationState.A0Q;
            c50693MZn.A02(creationState5, creationState18, C52494NKn.class);
            c50693MZn.A02(creationState15, creationState18, C52494NKn.class);
            CreationState creationState19 = CreationState.A09;
            c50693MZn.A02(creationState18, creationState19, C52492NKk.class);
            c50693MZn.A02(creationState18, creationState17, C52493NKm.class);
            CreationState creationState20 = CreationState.A08;
            c50693MZn.A02(creationState5, creationState20, C52495NKo.class);
            c50693MZn.A02(creationState15, creationState20, C52495NKo.class);
            c50693MZn.A02(creationState5, creationState19, C52492NKk.class);
            c50693MZn.A02(creationState15, creationState19, C52492NKk.class);
            CreationState creationState21 = CreationState.A07;
            c50693MZn.A02(creationState5, creationState21, NKl.class);
            c50693MZn.A02(creationState15, creationState21, NKl.class);
            c50693MZn.A02(creationState5, creationState17, C52493NKm.class);
            c50693MZn.A02(creationState15, creationState17, C52493NKm.class);
            c50693MZn.A02(creationState19, creationState17, C52493NKm.class);
            c50693MZn.A02(creationState21, creationState20, C52495NKo.class);
            c50693MZn.A02(creationState17, creationState19, C52492NKk.class);
            c50693MZn.A02(creationState17, creationState21, NKl.class);
            c50693MZn.A02(creationState5, creationState2, NLE.class);
            c50693MZn.A02(creationState5, creationState8, NL9.class);
            c50693MZn.A02(creationState5, creationState9, NLA.class);
            c50693MZn.A02(creationState5, CreationState.A0X, C52506NKz.class);
            CreationState creationState22 = CreationState.A0M;
            c50693MZn.A02(creationState16, creationState22, C52500NKt.class);
            CreationState creationState23 = CreationState.A01;
            c50693MZn.A02(creationState16, creationState23, C52496NKp.class);
            c50693MZn.A02(creationState23, CreationState.A05, NL6.class);
            c50693MZn.A02(creationState15, creationState22, C52500NKt.class);
            c50693MZn.A02(creationState15, creationState23, C52496NKp.class);
            c50693MZn.A02(creationState15, creationState12, NL2.class);
            c50693MZn.A02(creationState15, creationState16, NL7.class);
            AbstractC25651Mw.A00(this.A04).A01(this.A0A, C50695MZq.class);
            this.A0A.A01(this);
            Iterator it = this.A0M.iterator();
            while (it.hasNext()) {
                this.A0A.A01((InterfaceC41501vz) it.next());
            }
            return;
        }
        throw AbstractC166987dD.A18("State machine already initialised.");
    }

    public final void A08() {
        C50693MZn c50693MZn;
        View view;
        int i;
        if (this.A0D != null && (c50693MZn = this.A0A) != null) {
            CreationState A00 = c50693MZn.A00();
            if (A00 != CreationState.A02 && A00 != CreationState.A04 && A00 != CreationState.A0R && A00 != CreationState.A0H && A00 != CreationState.A0c && A00 != CreationState.A0T && A00 != CreationState.A0U && A00 != CreationState.A0O && A00 != CreationState.A0W && A00 != CreationState.A0P && A00 != CreationState.A0X && A00 != CreationState.A03 && A00 != CreationState.A0M && A00 != CreationState.A0B && A00 != CreationState.A0Q && A00 != CreationState.A01 && A00 != CreationState.A05 && A00 != CreationState.A0I) {
                view = this.A0D;
                i = 4;
            } else {
                view = this.A0D;
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    public final void A09(Medium medium) {
        C5L6 c5l6;
        Location location;
        int i = 0;
        if (medium.A05()) {
            double[] A07 = medium.A07(getContentResolver());
            if (A07 != null) {
                location = new Location("photo");
                location.setLatitude(A07[0]);
                location.setLongitude(A07[1]);
            } else {
                location = null;
            }
            if ("image/jpeg".equals(medium.A03())) {
                String str = medium.A0X;
                int i2 = medium.A07;
                String str2 = medium.A0Y;
                MediaUploadMetadata mediaUploadMetadata = medium.A0G;
                String str3 = medium.A0N;
                String str4 = medium.A0W;
                if (str4 != null) {
                    A02(location, AbstractC25227BEk.A0B(str4), mediaUploadMetadata, this, null, str, str2, str3, str, medium.A0M, medium.A0P, medium.A0Q, medium.A0S, null, null, i2, 0);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            schedule(new KK4(2, this, medium, location));
            return;
        }
        if (!medium.Cff()) {
            return;
        }
        String str5 = medium.A0X;
        getApplicationContext();
        C44059Jdk A00 = C44059Jdk.A00(str5, 0);
        if (AbstractC23048AEe.A01(A00, new C7FH(this), true, true)) {
            if (MX5.A00(this).A0K) {
                i = getIntent().getIntExtra("mediaSource", 1);
            }
            AnonymousClass841 anonymousClass841 = this.A09.A00;
            C47Z A002 = AbstractC44068Jdt.A00(null, i);
            if (anonymousClass841 != null) {
                if (str5 != null) {
                    anonymousClass841.End(str5);
                    anonymousClass841.Eab(A002.A35);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            String str6 = medium.A0Y;
            if (str6 != null) {
                A002.A3h = str6;
            }
            String str7 = medium.A0Q;
            if (str7 != null) {
                A002.A2V = str7;
            }
            String str8 = medium.A0P;
            if (str8 != null) {
                A002.A2W = str8;
            }
            String str9 = medium.A0M;
            if (str9 != null) {
                A002.A2o = str9;
                String str10 = medium.A0S;
                if (str10 != null) {
                    A002.A2n = str10;
                }
            }
            this.A0B.A0D(A002);
            AbstractC44068Jdt.A02(this.A04, this.A09.A00(), A002, A00, 1.0f, 1000 * AbstractC54246NyR.A00(this.A04));
            float A003 = AbstractC13600mm.A00(A002.A0H / A002.A0G, 0.8f, 1.91f);
            if (!getIntent().getBooleanExtra("videoRectangleCrop", false)) {
                A003 = 1.0f;
            }
            A002.A02 = A003;
            A002.A1N.A00 = A003;
            MSX.A0L(this).EPt(A003);
            AnonymousClass841 A0L = MSX.A0L(this);
            if (getIntent().getBooleanExtra("videoRectangleCrop", false)) {
                c5l6 = C5L6.A08;
            } else {
                c5l6 = C5L6.A0E;
            }
            ((MX5) A0L).A01.A06 = c5l6;
            Cs4(A002);
            return;
        }
        onBackPressed();
    }

    @Override // X.InterfaceC189598ae
    public final void AIe() {
        AnonymousClass257.A00(this.A04).A04();
    }

    @Override // X.InterfaceC189608af
    public final AnonymousClass840 Ak4() {
        return this.A09;
    }

    @Override // X.InterfaceC189628ah
    public final CreationSession Asi() {
        return this.A06;
    }

    @Override // X.InterfaceC189598ae
    public final C47Z BcC(String str) {
        return AbstractC43593JPy.A0h(this.A04, str);
    }

    @Override // X.InterfaceC58286Pse
    public final InterfaceC197218ns Bmb(String str) {
        MXA mxa = this.A08;
        mxa.getClass();
        OJQ ojq = this.A02;
        C14360o3.A0B(str, 0);
        Map map = mxa.A0A;
        if (!map.containsKey(str)) {
            mxa.A02(ojq, str);
        }
        Object obj = map.get(str);
        if (obj != null) {
            return (InterfaceC197218ns) obj;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C2d5
    public final C3O0 By1() {
        C3O0 c3o0 = this.A0F;
        if (c3o0 == null) {
            View findViewById = findViewById(R.id.snack_bar_stub);
            findViewById.getClass();
            ViewStub viewStub = (ViewStub) findViewById;
            C14360o3.A0B(viewStub, 1);
            C3O0 c3o02 = new C3O0(viewStub, false);
            this.A0F = c3o02;
            return c3o02;
        }
        return c3o0;
    }

    @Override // X.InterfaceC189628ah
    public final UserSession CE4() {
        return this.A04;
    }

    @Override // X.InterfaceC50446MPa
    public final void Cqo(Uri uri) {
        O2L o2l;
        Bundle bundle;
        int i;
        String str;
        AbstractC31718DwN.A01(this.A04, C05F.A0M);
        EnumC69983Ch enumC69983Ch = MX5.A00(this).A0A;
        enumC69983Ch.getClass();
        if (enumC69983Ch != EnumC69983Ch.A05) {
            EnumC69983Ch enumC69983Ch2 = MX5.A00(this).A0A;
            enumC69983Ch2.getClass();
            if (enumC69983Ch2 != EnumC69983Ch.A03) {
                C14360o3.A0B(uri, 1);
                o2l = new O2L(this);
                bundle = o2l.A00;
                bundle.putParcelable("CropFragment.imageUri", uri);
                bundle.putInt("CropFragment.largestDimension", C3OO.FLAG_MOVED);
                i = 200;
                str = "CropFragment.smallestDimension";
                bundle.putInt(str, i);
                ((MX5) MSX.A0L(this)).A01.A02 = 0;
                C50695MZq.A00(this.A04, new C52504NKx(o2l.A00));
            }
        }
        C14360o3.A0B(uri, 1);
        o2l = new O2L(this);
        bundle = o2l.A00;
        bundle.putParcelable("CropFragment.imageUri", uri);
        bundle.putBoolean(AbstractC43591JPw.A00(243), true);
        i = 1080;
        str = "CropFragment.largestDimension";
        bundle.putInt(str, i);
        ((MX5) MSX.A0L(this)).A01.A02 = 0;
        C50695MZq.A00(this.A04, new C52504NKx(o2l.A00));
    }

    @Override // X.InterfaceC189598ae
    public final void EDa(Runnable runnable) {
        AnonymousClass257.A00(this.A04).A06(runnable);
    }

    @Override // X.InterfaceC189678am
    public final void EnO(C47Z c47z) {
        this.A0B.A0C(c47z);
    }

    @Override // X.InterfaceC189678am
    public final void FDD(C47Z c47z) {
        ShareType shareType;
        if (AbstractC31178DnM.A1X(C06090Tz.A05, this.A04, 36320579917849273L)) {
            shareType = ShareType.A0H;
        } else {
            shareType = ShareType.A0b;
        }
        c47z.A1k = shareType;
        this.A0B.A0G(c47z, true, true);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A04;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C25671My A00;
        C56024Otv c56024Otv;
        if (i != 27) {
            if (i != 80) {
                if (i != 130) {
                    if (i != 168) {
                        if (i != 169) {
                            return super.onKeyDown(i, keyEvent);
                        }
                        A00 = AbstractC25651Mw.A00(this.A04);
                        c56024Otv = C56024Otv.A06;
                    } else {
                        A00 = AbstractC25651Mw.A00(this.A04);
                        c56024Otv = C56024Otv.A05;
                    }
                } else {
                    A00 = AbstractC25651Mw.A00(this.A04);
                    c56024Otv = C56024Otv.A03;
                }
            } else {
                A00 = AbstractC25651Mw.A00(this.A04);
                c56024Otv = C56024Otv.A01;
            }
        } else {
            A00 = AbstractC25651Mw.A00(this.A04);
            c56024Otv = C56024Otv.A04;
        }
        A00.E4s(c56024Otv);
        return true;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 130) {
            AbstractC25651Mw.A00(this.A04).E4s(C56024Otv.A02);
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        this.A0T.add(Integer.valueOf(i));
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    private void A00() {
        MX5.A00(this).A06();
        this.A0N.clear();
        AbstractC13530mf.A0A(AbstractC50522MSa.A0g(this));
    }

    public static void A03(final MediaCaptureActivity mediaCaptureActivity) {
        if (MX5.A00(mediaCaptureActivity).A09 != null && MX5.A00(mediaCaptureActivity).A09.A05) {
            if (MX5.A00(mediaCaptureActivity).A0J) {
                AbstractC167007dF.A0J().post(new Runnable() { // from class: X.PLW
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaCaptureActivity mediaCaptureActivity2 = MediaCaptureActivity.this;
                        C50695MZq.A00(mediaCaptureActivity2.A04, new NLD(true, AbstractC167007dF.A1W(mediaCaptureActivity2.A03)));
                    }
                });
                return;
            } else {
                C50695MZq.A00(mediaCaptureActivity.A04, new NLD(false, AbstractC167007dF.A1W(mediaCaptureActivity.A03)));
                return;
            }
        }
        AbstractC54875OOn.A00(mediaCaptureActivity, mediaCaptureActivity.A04, mediaCaptureActivity.A09, mediaCaptureActivity, false);
    }

    public static void A04(MediaCaptureActivity mediaCaptureActivity, boolean z) {
        mediaCaptureActivity.A00();
        MXA mxa = mediaCaptureActivity.A08;
        mxa.getClass();
        synchronized (mxa) {
            mxa.A08.destroy();
            mxa.A07.AP6();
        }
        if (z) {
            C43878Jai A00 = AbstractC43847JaB.A00(mediaCaptureActivity.A04);
            A00.A03.clear();
            A00.A01 = null;
        }
    }

    private void A05(MediaSession mediaSession, boolean z, boolean z2) {
        C55W c55w;
        FilterGroupModel B6P;
        CropInfo AtF;
        C47Z A0h = AbstractC43593JPy.A0h(this.A04, mediaSession.BcD());
        MXA mxa = this.A08;
        mxa.getClass();
        String B6E = mediaSession.B6E();
        C14360o3.A0B(B6E, 0);
        mxa.A02(null, B6E);
        if (A0h != null && A0h.A5U) {
            if (z2 && (c55w = A0h.A1a) != null && (B6P = mediaSession.B6P()) != null && (AtF = mediaSession.AtF()) != null) {
                UserSession userSession = this.A04;
                Rect rect = AtF.A02;
                InterfaceC57929PmZ B2v = mediaSession.B2v();
                int value = B2v.getValue();
                if (c55w.A0P != null) {
                    PhotoFilter photoFilter = new PhotoFilter(userSession, C8M4.A00(userSession).A01(c55w.A0P.intValue()), ((FilterGroupModelImpl) B6P).A03);
                    Float f = c55w.A07;
                    f.getClass();
                    photoFilter.A00(AbstractC166987dD.A0A(f.floatValue(), 100.0f));
                    B6P.EUU(photoFilter, 17);
                    B6P.EUV(17, true);
                }
                Float f2 = c55w.A09;
                if (f2 != null) {
                    float floatValue = f2.floatValue();
                    ColorFilter colorFilter = new ColorFilter("star_light");
                    colorFilter.A00 = floatValue;
                    B6P.EUT(colorFilter, 9);
                    B6P.EUV(9, true);
                }
                ValueMapFilterModel A00 = AbstractC53930Nt3.A00();
                Float f3 = c55w.A03;
                if (f3 != null) {
                    A00.A00("brightness", f3.floatValue());
                }
                Float f4 = c55w.A04;
                if (f4 != null) {
                    A00.A00("contrast", f4.floatValue());
                }
                Float f5 = c55w.A0D;
                if (f5 != null) {
                    A00.A00("saturation", f5.floatValue());
                }
                Float f6 = c55w.A0H;
                if (f6 != null) {
                    A00.A00("temperature", f6.floatValue());
                }
                Float f7 = c55w.A0M;
                if (f7 != null) {
                    A00.A00("vignette", f7.floatValue());
                }
                Float f8 = c55w.A06;
                if (f8 != null) {
                    A00.A00("fade", f8.floatValue());
                }
                Integer num = c55w.A0S;
                if (num != null) {
                    A00.A03("tint_shadows_color", MSW.A0Z(num.intValue()).A01);
                    Float f9 = c55w.A0L;
                    f9.getClass();
                    A00.A00("tint_shadows_intensity", f9.floatValue());
                }
                Integer num2 = c55w.A0R;
                if (num2 != null) {
                    A00.A03("tint_highlights_color", MSW.A0Z(num2.intValue()).A01);
                    Float f10 = c55w.A0K;
                    f10.getClass();
                    A00.A00("tint_highlights_intensity", f10.floatValue());
                }
                Float f11 = c55w.A0F;
                if (f11 != null) {
                    A00.A00("sharpen", f11.floatValue());
                }
                Float f12 = c55w.A0E;
                if (f12 != null) {
                    A00.A00("shadows", f12.floatValue());
                }
                Float f13 = c55w.A08;
                if (f13 != null) {
                    A00.A00("highlights", f13.floatValue());
                }
                if (OXt.A02(A00) || OXt.A01(A00)) {
                    B6P.EUT(A00, 13);
                    B6P.EUV(13, true);
                }
                Float f14 = c55w.A0G;
                if (f14 != null) {
                    float floatValue2 = f14.floatValue();
                    ColorFilter colorFilter2 = new ColorFilter("local_laplacian");
                    colorFilter2.A00 = floatValue2;
                    B6P.EUT(colorFilter2, 10);
                    B6P.EUV(10, true);
                }
                SurfaceCropFilter surfaceCropFilter = new SurfaceCropFilter(false);
                PointF pointF = c55w.A01;
                if (pointF != null) {
                    surfaceCropFilter.A0K(rect, (int) pointF.x, (int) pointF.y, value, false);
                }
                Float f15 = c55w.A0A;
                if (f15 != null) {
                    surfaceCropFilter.A0F(f15.floatValue());
                }
                Float f16 = c55w.A0B;
                if (f16 != null) {
                    surfaceCropFilter.A0G(f16.floatValue());
                }
                Float f17 = c55w.A0C;
                if (f17 != null) {
                    surfaceCropFilter.A0H(f17.floatValue());
                }
                Integer num3 = c55w.A0O;
                if (num3 != null) {
                    surfaceCropFilter.A0I(num3.intValue());
                }
                B6P.EUU(surfaceCropFilter, 3);
                B6P.EUV(3, true);
                FilterGroupModel B6P2 = mediaSession.B6P();
                CropInfo AtF2 = mediaSession.AtF();
                AbstractC197358o6.A02(AtF2.A02, B6P2, AtF2.A01, AtF2.A00, B2v.getValue());
                if (A0h.A2k != null && AbstractC50722MaN.A00(this.A04)) {
                    AbstractC197358o6.A03(this.A04, mediaSession.B6P(), A0h.A2k);
                }
            }
            if (!z) {
                mediaSession.BqI().ELh();
                return;
            }
        } else if (!z) {
            return;
        }
        SurfaceCropFilter A002 = A0R.A00(mediaSession.B6P(), "FilterGroupUtil_setSurfaceCropFilterNeedsCropParams()");
        if (A002 == null) {
            return;
        }
        A002.A00.A0F = true;
    }

    private void A06(boolean z) {
        Context applicationContext;
        String str;
        Iterator A0n = MSX.A0n(MSX.A0L(this));
        while (A0n.hasNext()) {
            MediaSession A0R = MSW.A0R(A0n);
            Integer Btq = A0R.Btq();
            if (Btq == C05F.A00) {
                A05(A0R, z, true);
            } else if (Btq == C05F.A01) {
                VideoSession videoSession = (VideoSession) A0R;
                C47Z A0h = AbstractC43593JPy.A0h(this.A04, videoSession.A0G);
                if (A0h == null) {
                    AbstractC12120kG.A01("MediaCaptureActivity_setupVideoSessionForEdit", "pendingMedia is null.");
                    applicationContext = getApplicationContext();
                    str = "media_is_null";
                } else if (A0h.A33 != null) {
                    if (A0h.A5U && !z) {
                        videoSession.A00(A0h);
                        videoSession.A09 = A0h.A1i.A01;
                        videoSession.A03 = A0h.A05;
                        ClipInfo clipInfo = A0h.A1N;
                        videoSession.A02 = clipInfo.A07;
                        videoSession.A01 = clipInfo.A05;
                        videoSession.A0J = A0h.A5F;
                    }
                } else {
                    AbstractC12120kG.A01("MediaCaptureActivity_setupVideoSessionForEdit", "image file path is null.");
                    applicationContext = getApplicationContext();
                    str = "media_file_path_unavailable";
                }
                C9GR.A0B(applicationContext, str);
            }
        }
        if (z) {
            CreationSession A00 = MX5.A00(this);
            Iterator it = A00.A0E.iterator();
            while (it.hasNext()) {
                MediaSession A0R2 = MSW.A0R(it);
                OL6 ol6 = (OL6) A00.A0O.get(A0R2.B6E());
                if (A0R2.Btq() == C05F.A00 && ol6 != null) {
                    FilterGroupModel A002 = ol6.A00();
                    if (A002 != null) {
                        A0R2.EUW(A002);
                    }
                    A0R2.Edh(ol6.A05);
                }
            }
            A00.A0O.clear();
        }
        MSX.A0L(this).ELl(this);
    }

    @Override // X.InterfaceC58030PoG
    public final void AGm() {
        if (C06P.A01(getSupportFragmentManager())) {
            EnumC69983Ch enumC69983Ch = MX5.A00(this).A0A;
            enumC69983Ch.getClass();
            if (enumC69983Ch != EnumC69983Ch.A05) {
                EnumC69983Ch enumC69983Ch2 = MX5.A00(this).A0A;
                enumC69983Ch2.getClass();
                if (enumC69983Ch2 != EnumC69983Ch.A03) {
                    C50695MZq.A00(this.A04, new C52501NKu());
                    return;
                }
            }
            setResult(-1, new Intent(MSX.A0L(this).E4J()));
            finish();
        }
    }

    @Override // X.MOM
    public final MediaEditActionBar BQj() {
        View findViewById = findViewById(R.id.media_edit_action_bar);
        findViewById.getClass();
        return (MediaEditActionBar) findViewById;
    }

    @Override // X.MQT
    public final void D1r() {
        onBackPressed();
    }

    @Override // X.InterfaceC50451MPf
    public final void DH7(Location location, Uri uri, MediaUploadMetadata mediaUploadMetadata, CropInfo cropInfo, String str, String str2, String str3, HashMap hashMap, int i, int i2) {
        Uri uri2;
        String path = uri.getPath();
        path.getClass();
        if (str2 != null) {
            uri2 = AbstractC08820cl.A03(str2);
        } else {
            uri2 = null;
        }
        A02(location, uri2, mediaUploadMetadata, this, cropInfo, path, null, str, str2, null, null, null, null, str3, hashMap, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.1vN] */
    @Override // X.InterfaceC58029PoF
    public final void Di2(boolean z) {
        final String A02;
        String str;
        InterfaceC15850qf interfaceC15850qf;
        Iterator A0n = MSX.A0n(MSX.A0L(this));
        while (A0n.hasNext()) {
            MediaSession A0R = MSW.A0R(A0n);
            String BcD = A0R.BcD();
            C47Z A0h = AbstractC43593JPy.A0h(this.A04, BcD);
            final boolean z2 = true;
            if (A0h == null) {
                HashMap A1G = AbstractC166987dD.A1G();
                if (BcD != null) {
                    z2 = false;
                }
                A1G.put("Pending Media Key is null: ", String.valueOf(z2));
                AbstractC12120kG.A0I("MediaCaptureActivity: failed to copy album draft", null, A1G);
            } else if (A0h.A5U && !A0h.A5R) {
                final C47Z A00 = AbstractC209399Nx.A00(A0h, AbstractC43593JPy.A0x());
                A00.A3O = null;
                A0h.A30 = A00.A3t;
                C25A.A00(this.A04).A0D(A00, A00.A35);
                Integer Btq = A0R.Btq();
                if (Btq == C05F.A00) {
                    A02 = AbstractC15860qg.A02();
                    A02.getClass();
                    final boolean z3 = false;
                    str = A0h.A3Z;
                    str.getClass();
                    interfaceC15850qf = new InterfaceC15850qf() { // from class: X.Ox5
                        @Override // X.InterfaceC15850qf
                        public final void DYY(boolean z4) {
                            MediaCaptureActivity mediaCaptureActivity = MediaCaptureActivity.this;
                            boolean z5 = z3;
                            C47Z c47z = A00;
                            String str2 = A02;
                            if (z4) {
                                if (z5) {
                                    c47z.A33 = str2;
                                } else {
                                    c47z.A3Z = str2;
                                }
                                C40121td c40121td = mediaCaptureActivity.A0B;
                                c47z.A5U = true;
                                c47z.A5S = true;
                                c40121td.A05.A04();
                            }
                        }
                    };
                } else if (Btq == C05F.A01) {
                    VideoSession videoSession = (VideoSession) A0R;
                    int i = videoSession.A09;
                    int i2 = videoSession.A03;
                    int i3 = videoSession.A02;
                    int i4 = videoSession.A01;
                    boolean z4 = videoSession.A0J;
                    A00.A1i.A01 = i;
                    A00.A05 = i2;
                    ClipInfo clipInfo = A00.A1N;
                    clipInfo.A07 = i3;
                    clipInfo.A05 = i4;
                    A00.A5F = z4;
                    A02 = AbstractC916948n.A01().getAbsolutePath();
                    str = A0h.A33;
                    if (str == null) {
                        str = A0h.A3Z;
                        str.getClass();
                    }
                    interfaceC15850qf = new InterfaceC15850qf() { // from class: X.Ox5
                        @Override // X.InterfaceC15850qf
                        public final void DYY(boolean z42) {
                            MediaCaptureActivity mediaCaptureActivity = MediaCaptureActivity.this;
                            boolean z5 = z2;
                            C47Z c47z = A00;
                            String str2 = A02;
                            if (z42) {
                                if (z5) {
                                    c47z.A33 = str2;
                                } else {
                                    c47z.A3Z = str2;
                                }
                                C40121td c40121td = mediaCaptureActivity.A0B;
                                c47z.A5U = true;
                                c47z.A5S = true;
                                c40121td.A05.A04();
                            }
                        }
                    };
                }
                AbstractC15860qg.A04(str, A02, AbstractC25225BEi.A16(interfaceC15850qf));
            }
        }
        if (z) {
            CwH(false, true, true);
        } else {
            AbstractC25651Mw.A00(this.A04).A05(new Object());
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        if (C2U7.A00) {
            boolean z = this.A0C;
            int i = 0;
            int i2 = R.anim.modal_slide_down_exit;
            if (z) {
                i = R.anim.fragment_slide_right_enter;
                i2 = R.anim.fragment_slide_right_exit;
            }
            overridePendingTransition(i, i2);
        }
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Fragment A0I;
        super.onActivityResult(i, i2, intent);
        AbstractC59962oe abstractC59962oe = this.A03;
        if (abstractC59962oe != null) {
            abstractC59962oe.onActivityResult(i, i2, intent);
        }
        if (this.A0T.remove(Integer.valueOf(i)) && (A0I = AbstractC31177DnL.A0I(this)) != null) {
            A0I.onActivityResult(i, i2, intent);
        }
        if (i == 5652) {
            if (i2 == -1 || i2 == 0) {
                AbstractC116275Og.A00();
            }
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-1217937685);
        C50699MZu A00 = AbstractC50666MYj.A00(this.A04);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00.A04, "ig_feed_gallery_app_background");
        if (A0f.isSampled()) {
            AbstractC50522MSa.A1E(A0f, "camera_session_id", C50699MZu.A03(A00));
            A0f.AAP("gallery_type", "old_gallery");
            AbstractC31171DnF.A1D(A0f, "ig_creation_client_events");
            A0f.A8R(A00.A00, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            AbstractC167017dG.A1C(A0f);
        }
        C0f9.A0A(1115952133, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(-1933121804);
        C50699MZu A00 = AbstractC50666MYj.A00(this.A04);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00.A04, "ig_feed_gallery_app_foreground");
        if (A0f.isSampled()) {
            AbstractC166987dD.A1S(A0f, C50699MZu.A03(A00));
            AbstractC167017dG.A1A(A00.A00, A0f);
            A0f.AAP("gallery_type", "old_gallery");
            AbstractC31171DnF.A1D(A0f, "ig_creation_client_events");
            AbstractC167017dG.A1C(A0f);
        }
        C0f9.A0A(-1802357863, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (((X.InterfaceC60072op) r1).onBackPressed() != false) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBackPressed() {
        /*
            r9 = this;
            X.0nS r1 = X.C14120nc.A00()
            X.NGC r0 = new X.NGC
            r0.<init>(r9)
            r1.ATO(r0)
            X.3DN r0 = r9.mBottomSheetNavigator
            r5 = 1
            if (r0 == 0) goto L18
            boolean r0 = r0.A0Y()
            if (r0 != r5) goto L18
        L17:
            return
        L18:
            X.MXB r0 = r9.A07
            if (r0 == 0) goto L26
            boolean r0 = r0.A04
            if (r0 == 0) goto L26
            com.instagram.common.session.UserSession r1 = r9.A04
            r0 = 0
            X.AbstractC55032OXr.A02(r1, r0, r0)
        L26:
            X.MZn r0 = r9.A0A
            if (r0 == 0) goto L3c
            java.util.Stack r0 = r0.A02
            int r0 = r0.size()
            if (r0 <= r5) goto L3c
            X.0h2 r0 = r9.getSupportFragmentManager()
            int r0 = r0.A0L()
            if (r0 != 0) goto L53
        L3c:
            com.instagram.common.session.UserSession r0 = r9.A04
            X.8JY r7 = X.C8JX.A00(r0)
            java.lang.String r6 = "back_pressed"
            long r1 = r7.A00
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L51
            X.1QT r0 = r7.A02
            r0.flowEndCancel(r1, r6)
        L51:
            r7.A00 = r3
        L53:
            X.Ou8 r4 = r9.A05
            if (r4 == 0) goto L71
            X.MZn r7 = r9.A0A
            X.0h2 r1 = r4.A01
            r3 = 0
            if (r1 == 0) goto L7d
            r0 = 2131435251(0x7f0b1ef3, float:1.8492339E38)
            androidx.fragment.app.Fragment r1 = r1.A0O(r0)
            boolean r0 = r1 instanceof X.InterfaceC60072op
            if (r0 == 0) goto L7d
            X.2op r1 = (X.InterfaceC60072op) r1
            boolean r0 = r1.onBackPressed()
            if (r0 == 0) goto L7d
        L71:
            X.Ou8 r0 = r9.A05
            if (r0 != 0) goto L17
            java.lang.String r1 = "MediaCaptureActivity"
            java.lang.String r0 = "logStartCameraSession() mCameraSession is not null"
            X.AbstractC12120kG.A01(r1, r0)
            return
        L7d:
            r7.getClass()
            com.instagram.creation.state.CreationState r1 = r7.A00()
            com.instagram.creation.state.CreationState r0 = com.instagram.creation.state.CreationState.A0W
            if (r1 != r0) goto Ld0
            X.6WI r8 = X.C6WI.A01()
            com.instagram.common.session.UserSession r6 = r4.A03
            X.841 r1 = r4.A05
            r0 = r1
            X.MX5 r0 = (X.MX5) r0
            com.instagram.creation.base.CreationSession r2 = r0.A01
            boolean r0 = r2.A0I
            if (r0 == 0) goto Lb1
            java.lang.String r0 = "gallery"
        L9b:
            r8.A06(r6, r0)
            boolean r0 = r2.A0I
            if (r0 == 0) goto Ld0
            android.content.Context r1 = r4.A00
            r0 = r1
            X.8aj r0 = (X.InterfaceC189648aj) r0
            r0.ELe(r3)
            r0 = 2131955039(0x7f130d5f, float:1.9546594E38)
            X.C9GR.A08(r1, r0, r3)
            goto L71
        Lb1:
            boolean r0 = r1.CPp()
            if (r0 == 0) goto Lba
            java.lang.String r0 = "edit_carousel"
            goto L9b
        Lba:
            com.instagram.creation.base.MediaSession r0 = r2.A07
            if (r0 == 0) goto Lc9
            java.lang.Integer r1 = r0.Btq()
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto Lc9
            java.lang.String r0 = "edit_photo"
            goto L9b
        Lc9:
            r0 = 352(0x160, float:4.93E-43)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            goto L9b
        Ld0:
            java.util.Stack r0 = r7.A02
            int r0 = r0.size()
            if (r0 <= r5) goto Lde
            com.instagram.common.session.UserSession r0 = r4.A03
            X.AbstractC43593JPy.A1P(r0)
            goto L71
        Lde:
            r9.A0K = r5
            super.onBackPressed()
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.activity.MediaCaptureActivity.onBackPressed():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x020d, code lost:
    
        if (r8.hasExtra(r9) == false) goto L22;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x030a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04a5  */
    /* JADX WARN: Type inference failed for: r16v1, types: [X.OR5, java.lang.Object] */
    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r44) {
        /*
            Method dump skipped, instructions count: 1442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.activity.MediaCaptureActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int A00 = C0f9.A00(1287033004);
        super.onDestroy();
        C218914p.A06(this);
        C50713MaC.A01(this.A04, this);
        boolean z = this.A06.A0F;
        UserSession userSession = this.A04;
        if (z) {
            C43878Jai A002 = AbstractC43847JaB.A00(userSession);
            A002.A03.clear();
            A002.A01 = null;
            AbstractC43847JaB.A00(this.A04).A04.clear();
            AbstractC43847JaB.A00(this.A04).A00 = 1.0f;
        } else {
            C14360o3.A0B(userSession, 0);
            userSession.A03(C43878Jai.class);
        }
        this.A0A.getClass();
        C25671My A003 = AbstractC25651Mw.A00(this.A04);
        A003.A02(this.A0A, C50695MZq.class);
        A003.A02(this, C50698MZt.class);
        MXB mxb = this.A07;
        mxb.getClass();
        mxb.A03 = true;
        Integer num = mxb.A02;
        if (num != null) {
            MXB.A06(mxb, num);
        }
        mxb.A07.removeCallbacksAndMessages(null);
        this.A07 = null;
        this.A0N.clear();
        this.A05 = null;
        MXA mxa = this.A08;
        mxa.getClass();
        synchronized (mxa) {
            mxa.A08.destroy();
            mxa.A07.AP6();
        }
        this.A08 = null;
        this.A0A = null;
        this.A03 = null;
        C0f9.A07(-297892077, A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f1, code lost:
    
        if (r0.A07 == null) goto L51;
     */
    @Override // X.InterfaceC41501vz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.activity.MediaCaptureActivity.onEvent(java.lang.Object):void");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        int A00 = C0f9.A00(45211756);
        super.onPause();
        C41451vu c41451vu = C41451vu.A01;
        c41451vu.A03(this.A0R, C3KD.class);
        c41451vu.A03(this.A0O, C3KF.class);
        c41451vu.A03(this.A0S, C3KH.class);
        c41451vu.A03(this.A0P, C3KI.class);
        c41451vu.A03(this.A0Q, C3KJ.class);
        C0f9.A07(-1507695051, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        int A00 = C0f9.A00(-256134851);
        super.onResume();
        C25A.A00(this.A04).A0B(getApplicationContext());
        C41451vu c41451vu = C41451vu.A01;
        c41451vu.A02(this.A0R, C3KD.class);
        c41451vu.A02(this.A0O, C3KF.class);
        c41451vu.A02(this.A0S, C3KH.class);
        c41451vu.A02(this.A0P, C3KI.class);
        c41451vu.A02(this.A0Q, C3KJ.class);
        boolean A1X = AbstractC31178DnM.A1X(C06090Tz.A05, this.A04, 36329629413491148L);
        UserSession userSession = this.A04;
        if (A1X) {
            C131965xW.A01(userSession, getApplicationContext(), "feed_composer_prefetch");
        } else {
            C196068lw.A00(userSession).A01(A0U, null, "feed_composer_prefetch");
        }
        AbstractC173457nx.A00(this.A04).A01();
        C173557o7 A002 = AbstractC173537o5.A00(this.A04);
        if (!A002.A00) {
            A002.A00();
        }
        C0f9.A07(1296159166, A00);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.A0A.getClass();
        Stack stack = this.A0A.A02;
        CreationState[] creationStateArr = new CreationState[stack.size()];
        stack.copyInto(creationStateArr);
        bundle.putParcelableArray("MediaCaptureActivity.BUNDLE_STATE", creationStateArr);
        bundle.putParcelable("MediaCaptureActivity.CREATION_SESSION", this.A06);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        int A00 = C0f9.A00(714296674);
        super.onStart();
        if (this.A0H == null) {
            UserSession userSession = this.A04;
            C22P c22p = this.A01;
            C1810981l c1810981l = this.A0E;
            c1810981l.getClass();
            this.A0H = Boolean.valueOf(AbstractC50694MZo.A00(this, c22p, userSession, c1810981l, this.A09.A02.A01.A09));
            C50693MZn c50693MZn = this.A0A;
            if (c50693MZn != null && this.A05 != null && c50693MZn.A00() == CreationState.A0I) {
                AbstractC50666MYj.A00(this.A04).A06(null, AnonymousClass249.PHOTO, C56036Ou8.A02(MSX.A0L(this).CpK()), C56036Ou8.A03(MSX.A0L(this).CpK()), C56036Ou8.A00(MSX.A0L(this).CpK()), C56036Ou8.A01(MSX.A0L(this).CpK()), MSX.A0L(this).CpK().size());
            }
        }
        C0f9.A07(-672871585, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        int i;
        int A00 = C0f9.A00(-247493693);
        super.onStop();
        if (isFinishing()) {
            Boolean bool = this.A0H;
            if (bool != null && !bool.booleanValue() && (this.A0K || this.A0L)) {
                i = 1646167854;
                C0f9.A07(i, A00);
            }
            C50693MZn c50693MZn = this.A0A;
            if (c50693MZn != null && c50693MZn.A00() == CreationState.A0I) {
                AbstractC50666MYj.A00(this.A04).A08(AnonymousClass249.PHOTO);
            }
            UserSession userSession = this.A04;
            C14360o3.A0B(userSession, 0);
            AnonymousClass229.A01(userSession).A0W();
            AnonymousClass229.A02(userSession);
        }
        i = -1364569357;
        C0f9.A07(i, A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(android.location.Location r7, android.net.Uri r8, com.instagram.common.gallery.metadata.MediaUploadMetadata r9, com.instagram.creation.activity.MediaCaptureActivity r10, com.instagram.creation.base.CropInfo r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.util.HashMap r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.activity.MediaCaptureActivity.A02(android.location.Location, android.net.Uri, com.instagram.common.gallery.metadata.MediaUploadMetadata, com.instagram.creation.activity.MediaCaptureActivity, com.instagram.creation.base.CropInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap, int, int):void");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return this.A04;
    }
}
