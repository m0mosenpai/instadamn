package X;

import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.GsB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38266GsB {
    public C31200Dnj A00;
    public XFR A01;
    public C84923qg A02;
    public Float A03;
    public Integer A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final C69141ViW A0I;
    public final Reel A0J;
    public final C41181vS A0K;
    public final User A0L;
    public final Integer A0M;
    public final boolean A0N;

    public C38266GsB(C84923qg c84923qg, C41181vS c41181vS) {
        this.A0F = false;
        this.A0H = false;
        this.A0G = false;
        this.A0D = false;
        this.A0E = false;
        this.A0J = null;
        this.A0K = c41181vS;
        this.A0M = C05F.A0Y;
        this.A0I = null;
        this.A0N = false;
        this.A0L = c84923qg.A08;
        this.A02 = c84923qg;
    }

    public C38266GsB(Reel reel, C41181vS c41181vS, User user, boolean z) {
        Integer num;
        this.A0F = false;
        this.A0H = false;
        this.A0G = false;
        this.A0D = false;
        this.A0E = false;
        this.A0J = reel;
        this.A0K = c41181vS;
        if (user != null && user.BJ8() == 0) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        this.A0M = num;
        this.A0L = user;
        this.A0I = null;
        this.A0N = z;
    }

    public C38266GsB(C69141ViW c69141ViW, C41181vS c41181vS) {
        this.A0F = false;
        this.A0H = false;
        this.A0G = false;
        this.A0D = false;
        this.A0E = false;
        this.A0J = c69141ViW.A02;
        this.A0K = c41181vS;
        this.A0M = C05F.A0C;
        this.A0I = c69141ViW;
        this.A0L = null;
        this.A0N = false;
    }

    public C38266GsB(Reel reel, C41181vS c41181vS) {
        this.A0F = false;
        this.A0H = false;
        this.A0G = false;
        this.A0D = false;
        this.A0E = false;
        this.A0J = reel;
        this.A0K = c41181vS;
        this.A0M = C05F.A0N;
        this.A0I = null;
        this.A0L = null;
        this.A0N = false;
    }
}
