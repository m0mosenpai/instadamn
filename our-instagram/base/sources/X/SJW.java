package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class SJW {
    public final int A00;
    public final C64089Sz6 A01;
    public final C64089Sz6 A02;
    public final C006802i A03;
    public final UserSession A04;
    public final AtomicBoolean A0A = new AtomicBoolean(false);
    public final AtomicBoolean A09 = new AtomicBoolean(false);
    public final AtomicBoolean A06 = new AtomicBoolean(false);
    public final AtomicBoolean A05 = new AtomicBoolean(false);
    public final AtomicBoolean A0C = new AtomicBoolean(false);
    public final AtomicBoolean A0B = new AtomicBoolean(false);
    public final AtomicBoolean A08 = new AtomicBoolean(false);
    public final AtomicBoolean A07 = new AtomicBoolean(false);

    public SJW(UserSession userSession) {
        this.A04 = userSession;
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        this.A03 = c006802i;
        this.A00 = AbstractC68470VSb.A00().hashCode();
        this.A02 = new C64089Sz6(this, 1);
        this.A01 = new C64089Sz6(this, 0);
    }
}
