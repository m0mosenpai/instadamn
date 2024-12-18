package X;

import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.direct.model.thread.ChannelsContextLine;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.direct.model.thread.CreatorSubscriberThreadInfo;
import com.instagram.direct.model.thread.DiscoverableThreadInfo;
import com.instagram.direct.smartsuggestion.model.SmartSuggestion;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5ng, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C126455ng extends C40781ul {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A05;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0J;
    public int A0K;
    public long A0L;
    public C9BH A0M;
    public C9BO A0N;
    public C9BW A0O;
    public C9BW A0P;
    public C9BW A0Q;
    public C9BW A0R;
    public C51593Mql A0S;
    public C51755Mte A0T;
    public C31200Dnj A0U;
    public C45127Jxw A0V;
    public C50679MYx A0W;
    public C50679MYx A0X;
    public C66618UPf A0Y;
    public C34498FIk A0Z;
    public C81613kW A0a;
    public C125805mV A0b;
    public C81543kP A0c;
    public C111214zj A0d;
    public C81563kR A0e;
    public DirectThreadThemeInfo A0f;
    public FGH A0g;
    public C133205zm A0h;
    public C106414qv A0i;
    public C32067E6t A0j;
    public E6W A0k;
    public ChannelsContextLine A0l;
    public CreatorBroadcastThreadInfo A0m;
    public CreatorSubscriberThreadInfo A0n;
    public C1118752z A0o;
    public DiscoverableThreadInfo A0p;
    public SmartSuggestion A0r;
    public User A0s;
    public Boolean A0t;
    public Boolean A0u;
    public Boolean A0v;
    public Boolean A0w;
    public Boolean A0x;
    public Boolean A0y;
    public Boolean A0z;
    public Boolean A10;
    public Boolean A11;
    public Boolean A12;
    public Boolean A13;
    public Boolean A14;
    public Boolean A15;
    public Boolean A16;
    public Boolean A17;
    public Boolean A18;
    public Long A19;
    public Long A1A;
    public String A1B;
    public String A1C;
    public String A1D;
    public String A1E;
    public String A1F;
    public String A1G;
    public String A1H;
    public String A1I;
    public String A1J;
    public String A1K;
    public String A1L;
    public String A1M;
    public String A1N;
    public String A1O;
    public String A1P;
    public HashMap A1Q;
    public HashMap A1R;
    public List A1U;
    public List A1V;
    public List A1W;
    public List A1a;
    public List A1b;
    public List A1c;
    public boolean A1e;
    public boolean A1f;
    public boolean A1g;
    public boolean A1h;
    public boolean A1i;
    public boolean A1j;
    public boolean A1k;
    public boolean A1l;
    public boolean A1m;
    public boolean A1n;
    public boolean A1o;
    public boolean A1p;
    public boolean A1q;
    public boolean A1r;
    public boolean A1s;
    public boolean A1t;
    public boolean A1u;
    public boolean A1v;
    public boolean A1w;
    public boolean A1x;
    public boolean A1y;
    public List A1Y = Collections.emptyList();
    public List A1Z = Collections.emptyList();
    public List A1d = Collections.emptyList();
    public List A1T = Collections.emptyList();
    public List A1X = new ArrayList();
    public HashMap A1S = new HashMap();
    public int A07 = 0;
    public int A09 = 0;
    public int A0I = 0;
    public int A0H = 0;
    public int A04 = -1;
    public int A06 = 0;
    public int A08 = -1;
    public EnumC46982Dm A0q = EnumC46982Dm.A05;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if ((r0.A01 & 4) != 4) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Long A00() {
        /*
            r5 = this;
            X.3kW r0 = r5.A0a
            r4 = 1
            r2 = 0
            if (r0 == 0) goto Le
            int r0 = r0.A01
            r1 = 4
            r0 = r0 & 4
            r3 = 1
            if (r0 == r1) goto Lf
        Le:
            r3 = 0
        Lf:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r5.A0z
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2c
            if (r3 != 0) goto L2c
            boolean r0 = r5.A1e
            if (r0 == 0) goto L29
            java.lang.Boolean r0 = r5.A15
            if (r0 == 0) goto L2f
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2f
        L29:
            java.lang.Long r0 = X.C2ED.A00
        L2b:
            return r0
        L2c:
            java.lang.Long r0 = r5.A19
            goto L57
        L2f:
            int r0 = r5.A0I
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.C4GR.A07(r0)
            if (r0 != 0) goto L29
            java.util.List r0 = r5.A1d
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            int r0 = r0.size()
            if (r0 != r4) goto L29
            java.util.List r0 = r5.A1d
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.lang.Object r0 = r0.get(r2)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.Long r0 = r0.BTC()
        L57:
            if (r0 != 0) goto L2b
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C126455ng.A00():java.lang.Long");
    }

    public final void A01() {
        EnumC46982Dm enumC46982Dm;
        EnumC46982Dm enumC46982Dm2;
        DirectThreadThemeInfo directThreadThemeInfo;
        HashMap hashMap = this.A1S;
        if (hashMap != null) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    it.remove();
                }
            }
        }
        C66618UPf c66618UPf = this.A0Y;
        if (c66618UPf != null && (directThreadThemeInfo = this.A0f) != null && directThreadThemeInfo.A0u) {
            this.A0f = AbstractC69936Vy7.A00(c66618UPf);
        }
        if (this.A0f == null) {
            this.A0f = AbstractC125795mU.A00();
        }
        Boolean bool = this.A12;
        if (bool != null && bool.booleanValue()) {
            enumC46982Dm = this.A0q;
            enumC46982Dm2 = EnumC46982Dm.A07;
        } else {
            Boolean bool2 = this.A11;
            if (bool2 == null || !bool2.booleanValue()) {
                return;
            }
            enumC46982Dm = this.A0q;
            enumC46982Dm2 = EnumC46982Dm.A06;
        }
        if (enumC46982Dm != enumC46982Dm2) {
            this.A0q = enumC46982Dm2;
        }
    }
}
