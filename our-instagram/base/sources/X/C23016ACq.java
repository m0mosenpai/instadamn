package X;

import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig;
import com.facebook.iabeventlogging.model.IABEmptyEvent;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABLaunchEvent;
import com.facebook.privacy.zone.api.ZonedValue;
import com.facebook.privacy.zone.policy.ZonePolicy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ACq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23016ACq {
    public IabCommonTrait A0O;
    public IABViewModeLaunchConfig A0P;
    public Boolean A0S;
    public Long A0U;
    public Long A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public ArrayList A0b;
    public boolean A0j;
    public boolean A0l;
    public final C0JM A0m;
    public final ZonePolicy A0n;
    public final boolean A0p;
    public ZonedValue A0Q = new ZonedValue(ZonePolicy.A05, "");
    public long A08 = 0;
    public long A0L = -1;
    public long A0K = -1;
    public long A0M = -1;
    public long A0B = -1;
    public long A0C = -1;
    public long A0A = -1;
    public long A0F = -1;
    public long A0H = -1;
    public int A00 = -1;
    public int A02 = 9;
    public int A03 = 9;
    public int A01 = 0;
    public long A0I = -1;
    public int A07 = -1;
    public int A06 = -1;
    public long A0N = -1;
    public long A0D = -1;
    public long A0E = -1;
    public long A0G = -1;
    public List A0d = null;
    public boolean A0i = false;
    public boolean A0g = false;
    public boolean A0e = false;
    public boolean A0f = false;
    public boolean A0h = false;
    public boolean A0k = false;
    public long A09 = -1;
    public Boolean A0T = false;
    public Boolean A0R = false;
    public int A04 = 1;
    public int A05 = 1;
    public long A0J = -1;
    public final ArrayList A0o = AbstractC166987dD.A1E();
    public List A0c = AbstractC166987dD.A1E();

    public final IABEvent A00() {
        if (!this.A0p) {
            return IABEvent.A04;
        }
        long now = this.A0m.now();
        return new IABEvent(EnumC61218RhI.IAB_OPEN_MENU, this.A0Z, now, now);
    }

    public final IABEvent A01(long j) {
        if (!this.A0p) {
            return IABEvent.A04;
        }
        IABEmptyEvent iABEmptyEvent = IABEvent.A04;
        String str = this.A0Z;
        long now = this.A0m.now();
        ZonedValue zonedValue = this.A0Q;
        long j2 = this.A0L;
        String str2 = this.A0W;
        long j3 = this.A08;
        List list = this.A0c;
        return new IABLaunchEvent(this.A0O, this.A0P, zonedValue, str, str2, this.A0X, list, j, now, j2, j3);
    }

    public final void A02(String str) {
        if (this.A0p) {
            try {
                VHa valueOf = VHa.valueOf(str);
                List list = this.A0d;
                if (list == null) {
                    list = AbstractC166987dD.A1E();
                    this.A0d = list;
                }
                C0Zx c0Zx = new C0Zx();
                c0Zx.A01(valueOf, "view_mode");
                c0Zx.A04("timestamp", Double.valueOf(Long.valueOf(this.A0m.now()).doubleValue()));
                list.add(c0Zx);
            } catch (IllegalArgumentException e) {
                C0K8.A0J("IABEventLogger", "Server and client implementations of IABViewMode are out of sync", e);
            }
        }
    }

    public C23016ACq(C0JM c0jm, ZonePolicy zonePolicy, boolean z) {
        this.A0p = z;
        this.A0m = c0jm;
        this.A0n = zonePolicy;
    }
}
