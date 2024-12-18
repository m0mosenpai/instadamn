package X;

import com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf;
import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.model.shopping.clips.IGTVShoppingInfoIntf;
import com.instagram.user.model.UpcomingEvent;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.Gi0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37667Gi0 {
    public static final boolean A03(C38321qM c38321qM, UpcomingEvent upcomingEvent) {
        String str;
        if (upcomingEvent == null) {
            return false;
        }
        ClipsShoppingCTABarIntf A00 = A00(c38321qM);
        if (A00 != null) {
            str = A00.getDestination();
        } else {
            str = null;
        }
        Integer A01 = A01(str, upcomingEvent.getReminderEnabled());
        return A01 == C05F.A0Y || A01 == C05F.A0j;
    }

    public static final ClipsShoppingCTABarIntf A00(C38321qM c38321qM) {
        IGTVShoppingInfoIntf BGP;
        ClipsShoppingInfoIntf Buh;
        ClipsShoppingInfoIntf Buh2;
        C3x9 clipsMetadata = c38321qM.A0C.getClipsMetadata();
        if (clipsMetadata != null && (Buh = clipsMetadata.Buh()) != null && Buh.AoW() != null) {
            C3x9 clipsMetadata2 = c38321qM.A0C.getClipsMetadata();
            if (clipsMetadata2 == null || (Buh2 = clipsMetadata2.Buh()) == null) {
                return null;
            }
            return Buh2.AoW();
        }
        IGTVShoppingInfoIntf BGP2 = c38321qM.A0C.BGP();
        if (BGP2 == null || BGP2.AoW() == null || (BGP = c38321qM.A0C.BGP()) == null) {
            return null;
        }
        return BGP.AoW();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r2 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        return X.C05F.A0Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        return X.C05F.A0j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
    
        if (r2 != false) goto L27;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Integer A01(java.lang.String r1, boolean r2) {
        /*
            if (r1 == 0) goto L9
            int r0 = r1.hashCode()
            switch(r0) {
                case -1741312354: goto L4b;
                case -1021656062: goto L3e;
                case -892664913: goto L31;
                case -590846444: goto L22;
                case 110844: goto L17;
                case 928336360: goto Lc;
                default: goto L9;
            }
        L9:
            java.lang.Integer r0 = X.C05F.A0u
            return r0
        Lc:
            java.lang.String r0 = "storefront"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            java.lang.Integer r0 = X.C05F.A00
            return r0
        L17:
            java.lang.String r0 = "pdp"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            java.lang.Integer r0 = X.C05F.A0C
            return r0
        L22:
            r0 = 184(0xb8, float:2.58E-43)
            java.lang.String r0 = X.MSV.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            java.lang.Integer r0 = X.C05F.A01
            return r0
        L31:
            java.lang.String r0 = "set_reminder"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            if (r2 != 0) goto L48
        L3b:
            java.lang.Integer r0 = X.C05F.A0Y
            return r0
        L3e:
            java.lang.String r0 = "view_upcoming_events"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            if (r2 == 0) goto L3b
        L48:
            java.lang.Integer r0 = X.C05F.A0j
            return r0
        L4b:
            java.lang.String r0 = "collection"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            java.lang.Integer r0 = X.C05F.A0N
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC37667Gi0.A01(java.lang.String, boolean):java.lang.Integer");
    }

    public static final ArrayList A02(C38321qM c38321qM) {
        Collection collection;
        Iterable iterable;
        ClipsShoppingInfoIntf Buh;
        IGTVShoppingInfoIntf BGP = c38321qM.A0C.BGP();
        if (BGP != null) {
            collection = I3S.A00(BGP);
        } else {
            collection = C16930sl.A00;
        }
        C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
        if (A0u == null || (Buh = A0u.Buh()) == null || (iterable = I3Q.A00(Buh)) == null) {
            iterable = C16930sl.A00;
        }
        return AbstractC001800i.A0S(iterable, collection);
    }
}
