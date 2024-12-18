package X;

import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.clips.template.creation.model.ClipsTemplateModel;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.model.venue.LocationDict;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class MXY {
    public AbstractC50639MXa A00;
    public AbstractC50639MXa A01;
    public AbstractC50639MXa A02;
    public AbstractC50639MXa A03;
    public AbstractC50639MXa A04;
    public AbstractC50639MXa A05;
    public AbstractC50639MXa A06;
    public AbstractC50639MXa A07;
    public AbstractC50639MXa A08;
    public AbstractC50639MXa A09;
    public AbstractC50639MXa A0A;
    public AbstractC50639MXa A0B;
    public AbstractC50639MXa A0C;
    public AbstractC50639MXa A0D;
    public AbstractC50639MXa A0E;
    public AbstractC50639MXa A0F;
    public AbstractC50639MXa A0G;
    public AbstractC50639MXa A0H;
    public AbstractC50639MXa A0I;
    public AbstractC50639MXa A0J;
    public AbstractC50639MXa A0K;
    public AbstractC50639MXa A0L;
    public AbstractC50639MXa A0M;
    public AbstractC50639MXa A0N;
    public AbstractC50639MXa A0O;
    public AbstractC50639MXa A0P;
    public AbstractC50639MXa A0Q;
    public AbstractC50639MXa A0R;
    public AbstractC50639MXa A0S;
    public AbstractC50639MXa A0T;
    public AbstractC50639MXa A0U;
    public AbstractC50639MXa A0V;
    public AbstractC50639MXa A0W;
    public AbstractC50639MXa A0X;
    public AbstractC50639MXa A0Y;
    public AbstractC50639MXa A0Z;
    public AbstractC50639MXa A0a;
    public AbstractC50639MXa A0b;
    public AbstractC50639MXa A0c;
    public AbstractC50639MXa A0d;
    public AbstractC50639MXa A0e;
    public AbstractC50639MXa A0f;
    public AbstractC50639MXa A0g;
    public AbstractC50639MXa A0h;
    public AbstractC50639MXa A0i;
    public AbstractC50639MXa A0j;
    public AbstractC50639MXa A0k;
    public AbstractC50639MXa A0l;
    public AbstractC50639MXa A0m;
    public AbstractC50639MXa A0n;
    public AbstractC50639MXa A0o;
    public AbstractC50639MXa A0p;
    public AbstractC50639MXa A0q;
    public AbstractC50639MXa A0r;
    public AbstractC50639MXa A0s;
    public AbstractC50639MXa A0t;
    public AbstractC50639MXa A0u;
    public AbstractC50639MXa A0v;
    public AbstractC50639MXa A0w;
    public AbstractC50639MXa A0x;
    public AbstractC50639MXa A0y;
    public AbstractC50639MXa A0z;
    public AbstractC50639MXa A10;
    public AbstractC50639MXa A11;
    public AbstractC50639MXa A12;
    public AbstractC50639MXa A13;

    public final C128175qm A01(C128175qm c128175qm) {
        C8r2 c8r2;
        JUM A00;
        C110204xp c110204xp;
        C14360o3.A0B(c128175qm, 0);
        String str = c128175qm.A0T;
        C5JK c5jk = c128175qm.A0H;
        EnumC50656MXw enumC50656MXw = (EnumC50656MXw) this.A12.A02(c128175qm.A0P);
        JUM jum = (JUM) AbstractC001800i.A0J(c128175qm.A0u);
        MXq mXq = MXq.A00;
        MXZ A002 = MXZ.A00(EnumC50657MXx.A05);
        AbstractC50639MXa abstractC50639MXa = this.A0u;
        List list = c128175qm.A0v;
        Object A02 = abstractC50639MXa.A02(list);
        C14360o3.A0B(A02, 0);
        MXZ A003 = MXZ.A00(A02);
        AbstractC50639MXa abstractC50639MXa2 = this.A0i;
        C203248yh c203248yh = c128175qm.A0C;
        C203248yh c203248yh2 = (C203248yh) abstractC50639MXa2.A02(c203248yh);
        UpcomingEventImpl upcomingEventImpl = null;
        if (c203248yh2 != null) {
            c8r2 = c203248yh2.A01;
        } else {
            c8r2 = null;
        }
        MXZ A004 = MXZ.A00(c8r2);
        AbstractC50639MXa abstractC50639MXa3 = this.A0b;
        List list2 = c128175qm.A0p;
        Object A022 = abstractC50639MXa3.A02(list2);
        if (A022 == null) {
            A022 = C16930sl.A00;
        }
        MXZ A005 = MXZ.A00(A022);
        AbstractC50639MXa abstractC50639MXa4 = this.A0n;
        List list3 = c128175qm.A0s;
        Object A023 = abstractC50639MXa4.A02(list3);
        if (A023 == null) {
            A023 = C16930sl.A00;
        }
        MXZ A006 = MXZ.A00(A023);
        if (jum == null) {
            String A0n = AbstractC166997dE.A0n();
            C14360o3.A0B(A0n, 0);
            A00 = AbstractC50640MXb.A00(new JUM(A0n), A002, A005, mXq, A006, A004, A003);
        } else {
            A00 = AbstractC50640MXb.A00(jum, A002, A005, mXq, A006, A004, A003);
        }
        List A1J = AbstractC166987dD.A1J(A00);
        List list4 = (List) this.A0u.A02(list);
        EnumC50651MXr enumC50651MXr = (EnumC50651MXr) this.A0y.A02(c128175qm.A0G);
        AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) this.A02.A02(c128175qm.A0N);
        AudioOverlayTrack audioOverlayTrack2 = c128175qm.A0M;
        List list5 = (List) this.A0b.A02(list2);
        String str2 = (String) this.A0g.A02(c128175qm.A0i);
        C203248yh c203248yh3 = (C203248yh) this.A0i.A02(c203248yh);
        List list6 = (List) this.A0n.A02(list3);
        List list7 = (List) this.A01.A02(c128175qm.A0j);
        List list8 = (List) this.A0l.A02(c128175qm.A0l);
        ShareMediaLoggingInfo shareMediaLoggingInfo = (ShareMediaLoggingInfo) this.A0k.A02(c128175qm.A0B);
        C9JS c9js = (C9JS) this.A0j.A02(c128175qm.A0E);
        String str3 = c128175qm.A0h;
        String str4 = (String) this.A06.A02(c128175qm.A0S);
        String str5 = (String) this.A0C.A02(c128175qm.A0V);
        MediaCroppingCoordinates mediaCroppingCoordinates = (MediaCroppingCoordinates) this.A0D.A02(c128175qm.A06);
        boolean A007 = A00(this.A0U, c128175qm.A17);
        String str6 = (String) this.A0H.A02(c128175qm.A0X);
        List list9 = (List) this.A0h.A02(c128175qm.A0q);
        C101394gx c101394gx = (C101394gx) this.A0A.A02(c128175qm.A0O);
        EnumC76383bi enumC76383bi = (EnumC76383bi) this.A00.A02(c128175qm.A0K);
        String str7 = (String) this.A0w.A02(c128175qm.A0U);
        List list10 = (List) this.A09.A02(c128175qm.A0n);
        String str8 = (String) this.A0F.A02(c128175qm.A0W);
        LocationDict locationDict = (LocationDict) this.A0X.A02(c128175qm.A0L);
        List list11 = (List) this.A0N.A02(c128175qm.A0o);
        String str9 = (String) this.A0f.A02(c128175qm.A0g);
        CropInfo cropInfo = (CropInfo) this.A0t.A02(c128175qm.A0A);
        C54632OBh c54632OBh = (C54632OBh) this.A05.A02(c128175qm.A0D);
        C38686GzR c38686GzR = (C38686GzR) this.A07.A02(c128175qm.A04);
        OL5 ol5 = (OL5) this.A0z.A02(c128175qm.A09);
        List list12 = (List) this.A0o.A02(c128175qm.A0t);
        boolean A008 = A00(this.A0Q, c128175qm.A12);
        boolean A009 = A00(this.A0V, c128175qm.A18);
        String str10 = (String) this.A0W.A02(c128175qm.A0a);
        String str11 = (String) this.A0M.A02(c128175qm.A0Z);
        ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel = (ExistingStandaloneFundraiserForFeedModel) this.A0G.A02(c128175qm.A0R);
        String str12 = (String) this.A0I.A02(c128175qm.A0Y);
        NewFundraiserInfo newFundraiserInfo = (NewFundraiserInfo) this.A0d.A02(c128175qm.A0J);
        InterfaceC110214xq interfaceC110214xq = (InterfaceC110214xq) this.A0v.A02(c128175qm.A08);
        if (interfaceC110214xq != null) {
            c110204xp = interfaceC110214xq.F4L();
        } else {
            c110204xp = null;
        }
        boolean A0010 = A00(this.A0p, c128175qm.A19);
        List list13 = c128175qm.A0k;
        String str13 = (String) this.A13.A02(c128175qm.A0b);
        boolean A0011 = A00(this.A0P, c128175qm.A11);
        boolean A0012 = A00(this.A10, c128175qm.A0z);
        boolean A0013 = A00(this.A0S, c128175qm.A14);
        boolean A0014 = A00(this.A0T, c128175qm.A16);
        boolean A0015 = A00(this.A0R, c128175qm.A13);
        List list14 = (List) this.A0m.A02(c128175qm.A0r);
        UpcomingEvent upcomingEvent = (UpcomingEvent) this.A0s.A02(c128175qm.A0Q);
        if (upcomingEvent != null) {
            upcomingEventImpl = upcomingEvent.F7b(null);
        }
        String str14 = (String) this.A0e.A02(c128175qm.A0f);
        int A0H = AbstractC166987dD.A0H(this.A0Y.A02(Integer.valueOf(c128175qm.A00)));
        long A0N = AbstractC166987dD.A0N(this.A0x.A02(Long.valueOf(c128175qm.A01)));
        OA3 oa3 = c128175qm.A0F;
        boolean A0016 = A00(this.A0L, c128175qm.A0y);
        boolean A0017 = A00(this.A0E, c128175qm.A0w);
        String str15 = (String) this.A0a.A02(c128175qm.A0d);
        String str16 = (String) this.A0Z.A02(c128175qm.A0c);
        String str17 = (String) this.A0c.A02(c128175qm.A0e);
        List list15 = (List) this.A08.A02(c128175qm.A0m);
        C51685MsG c51685MsG = (C51685MsG) this.A04.A02(c128175qm.A0I);
        return new C128175qm((C51756Mtf) this.A0r.A02(c128175qm.A02), (E72) this.A03.A02(c128175qm.A03), c38686GzR, (C38709H2v) this.A0B.A02(c128175qm.A05), mediaCroppingCoordinates, (MediaGenAIDetectionMethod) this.A0J.A02(c128175qm.A07), c110204xp, ol5, cropInfo, shareMediaLoggingInfo, c203248yh3, c54632OBh, c9js, oa3, enumC50651MXr, c5jk, c51685MsG, newFundraiserInfo, enumC76383bi, locationDict, audioOverlayTrack, audioOverlayTrack2, c101394gx, enumC50656MXw, upcomingEventImpl, existingStandaloneFundraiserForFeedModel, str, str4, str2, str3, str5, str6, str7, str8, str9, str13, str10, str11, str12, str14, str15, str16, str17, list4, list6, A1J, list9, list11, list10, list5, list8, list13, list7, list12, list14, list15, A0H, A0N, A007, A0010, A008, A009, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A00(this.A0K, c128175qm.A0x), A00(this.A11, c128175qm.A15), A00(this.A0O, c128175qm.A10), A00(this.A0q, c128175qm.A1A));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.OA3, java.lang.Object] */
    public final C128175qm A02(C5JK c5jk, String str) {
        C14360o3.A0B(str, 0);
        ArrayList A1E = AbstractC166987dD.A1E();
        EnumC50651MXr enumC50651MXr = EnumC50651MXr.A02;
        ?? obj = new Object();
        obj.A01 = -1L;
        obj.A02 = -1L;
        obj.A00 = -1L;
        return A01(new C128175qm(null, null, null, null, null, null, null, null, null, null, null, null, null, obj, enumC50651MXr, c5jk, null, null, null, null, null, null, null, EnumC50656MXw.A05, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, A1E, null, AbstractC166987dD.A1E(), null, null, null, null, null, null, null, null, null, null, 0, -1L, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false));
    }

    public final void A04(ClipsTemplateModel clipsTemplateModel) {
        C110204xp c110204xp;
        if (clipsTemplateModel != null) {
            c110204xp = clipsTemplateModel.A01;
        } else {
            c110204xp = null;
        }
        this.A0v = MXZ.A00(c110204xp);
        this.A13 = MXZ.A00(clipsTemplateModel != null ? clipsTemplateModel.A03 : null);
    }

    public final void A06(List list) {
        C14360o3.A0B(list, 0);
        this.A0u = MXZ.A00(list);
    }

    public MXY() {
        MXq mXq = MXq.A00;
        this.A12 = mXq;
        this.A0u = mXq;
        this.A02 = mXq;
        this.A0b = mXq;
        this.A0y = mXq;
        this.A0g = mXq;
        this.A0i = mXq;
        this.A0n = mXq;
        this.A0k = mXq;
        this.A0j = mXq;
        this.A06 = mXq;
        this.A0C = mXq;
        this.A0D = mXq;
        this.A0U = mXq;
        this.A0H = mXq;
        this.A0h = mXq;
        this.A0A = mXq;
        this.A00 = mXq;
        this.A0w = mXq;
        this.A09 = mXq;
        this.A0F = mXq;
        this.A0X = mXq;
        this.A0N = mXq;
        this.A0f = mXq;
        this.A0t = mXq;
        this.A05 = mXq;
        this.A07 = mXq;
        this.A0z = mXq;
        this.A0o = mXq;
        this.A0Q = mXq;
        this.A0V = mXq;
        this.A0W = mXq;
        this.A0M = mXq;
        this.A0G = mXq;
        this.A0I = mXq;
        this.A0d = mXq;
        this.A0v = mXq;
        this.A0p = mXq;
        this.A13 = mXq;
        this.A0P = mXq;
        this.A10 = mXq;
        this.A0S = mXq;
        this.A0T = mXq;
        this.A0R = mXq;
        this.A0m = mXq;
        this.A0s = mXq;
        this.A0e = mXq;
        this.A0Y = mXq;
        this.A0x = mXq;
        this.A01 = mXq;
        this.A0l = mXq;
        this.A0L = mXq;
        this.A0E = mXq;
        this.A0a = mXq;
        this.A0Z = mXq;
        this.A0c = mXq;
        this.A08 = mXq;
        this.A04 = mXq;
        this.A03 = mXq;
        this.A0r = mXq;
        this.A0B = mXq;
        this.A0K = mXq;
        this.A0J = mXq;
        this.A11 = mXq;
        this.A0O = mXq;
        this.A0q = mXq;
    }

    public static boolean A00(AbstractC50639MXa abstractC50639MXa, boolean z) {
        return ((Boolean) abstractC50639MXa.A02(Boolean.valueOf(z))).booleanValue();
    }

    public final void A03(long j) {
        this.A0x = MXZ.A00(Long.valueOf(j));
    }

    public final void A05(EnumC50651MXr enumC50651MXr) {
        this.A0y = MXZ.A00(enumC50651MXr);
    }
}
