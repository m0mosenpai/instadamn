package com.instagram.model.direct;

import X.AbstractC1345466e;
import X.AbstractC13670mt;
import X.AbstractC140946Yw;
import X.AbstractC140956Yx;
import X.AnonymousClass001;
import X.C05F;
import X.C122145g6;
import X.C14360o3;
import X.C23974Ak9;
import X.C2I7;
import X.C3o9;
import X.C4GR;
import X.C83693oE;
import X.C9Ay;
import X.EnumC46982Dm;
import X.InterfaceC2056098k;
import X.InterfaceC83703oF;
import X.InterfaceC83713oG;
import X.InterfaceC83733oI;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.thread.ChannelsContextLine;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.direct.model.thread.CreatorSubscriberThreadInfo;
import com.instagram.direct.model.thread.DiscoverableThreadInfo;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class DirectShareTarget implements Parcelable, DirectSearchResult {
    public static final Parcelable.Creator CREATOR = new C9Ay(1);
    public int A00;
    public int A01;
    public ImageUrl A02;
    public ChannelsContextLine A03;
    public CreatorBroadcastThreadInfo A04;
    public CreatorSubscriberThreadInfo A05;
    public DiscoverableThreadInfo A06;
    public EnumC46982Dm A07;
    public DirectShareTargetLoggingInfo A08;
    public InterfaceC83713oG A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Integer A0D;
    public Integer A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public List A0P;
    public List A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;

    public final boolean A0X(String str) {
        return A04(str, false) == C05F.A01;
    }

    public final boolean A0Y(String str) {
        int intValue = A04(str, false).intValue();
        return intValue == 4 || intValue == 5 || intValue == 7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DirectShareTarget directShareTarget = (DirectShareTarget) obj;
        InterfaceC83713oG interfaceC83713oG = this.A09;
        if (interfaceC83713oG instanceof InterfaceC83733oI) {
            InterfaceC83713oG interfaceC83713oG2 = directShareTarget.A09;
            if (interfaceC83713oG2 instanceof InterfaceC83733oI) {
                return interfaceC83713oG.equals(interfaceC83713oG2);
            }
        }
        return this.A0R == directShareTarget.A0R && (interfaceC83713oG instanceof InterfaceC83703oF) == (directShareTarget.A09 instanceof InterfaceC83703oF) && this.A0Q.containsAll(directShareTarget.A0Q) && directShareTarget.A0Q.containsAll(this.A0Q) && AbstractC13670mt.A0G(this.A0I, directShareTarget.A0I) && AbstractC13670mt.A0G(this.A0J, directShareTarget.A0J);
    }

    @Deprecated
    public final DirectThreadKey A00() {
        InterfaceC83713oG interfaceC83713oG = this.A09;
        if (interfaceC83713oG != null && (interfaceC83713oG instanceof InterfaceC83703oF)) {
            return AbstractC140956Yx.A01(AbstractC140946Yw.A01(interfaceC83713oG));
        }
        return new DirectThreadKey(this.A0Q);
    }

    public final InterfaceC83713oG A01() {
        InterfaceC83713oG interfaceC83713oG = this.A09;
        interfaceC83713oG.getClass();
        return interfaceC83713oG;
    }

    @Deprecated
    public final C3o9 A02() {
        InterfaceC83713oG interfaceC83713oG = this.A09;
        if (interfaceC83713oG == null) {
            return null;
        }
        return AbstractC140946Yw.A06(interfaceC83713oG);
    }

    public final Integer A03() {
        if (this.A0Q.size() == 1) {
            return ((PendingRecipient) this.A0Q.get(0)).A07;
        }
        return null;
    }

    public final Integer A04(String str, boolean z) {
        CreatorBroadcastThreadInfo creatorBroadcastThreadInfo;
        DiscoverableThreadInfo discoverableThreadInfo;
        Boolean bool = this.A0B;
        if (bool != null) {
            if (bool.booleanValue()) {
                return C05F.A0A;
            }
            return C05F.A09;
        }
        if (!A0S()) {
            if (!A0R()) {
                if (A0M()) {
                    Iterator it = this.A0Q.iterator();
                    while (it.hasNext()) {
                        if (((PendingRecipient) it.next()).A01 == 1) {
                            return C05F.A15;
                        }
                    }
                }
                int i = this.A01;
                if (C4GR.A01(i) && (discoverableThreadInfo = this.A06) != null) {
                    if (discoverableThreadInfo.A03) {
                        return C05F.A02;
                    }
                    return C05F.A1I;
                }
                if (C4GR.A02(i) && this.A05 != null) {
                    return C05F.A06;
                }
                if (i == 29 && (creatorBroadcastThreadInfo = this.A04) != null) {
                    int i2 = creatorBroadcastThreadInfo.A00;
                    boolean z2 = creatorBroadcastThreadInfo.A07;
                    if (i2 == 2) {
                        if (z2) {
                            return C05F.A08;
                        }
                        return C05F.A07;
                    }
                    if (z2) {
                        return C05F.A04;
                    }
                    return C05F.A03;
                }
                return C05F.A0u;
            }
            if (this.A0Q.size() == 1) {
                PendingRecipient pendingRecipient = (PendingRecipient) this.A0Q.get(0);
                int i3 = pendingRecipient.A01;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                return C05F.A0D;
                            }
                            throw new IllegalStateException(AnonymousClass001.A0O("Unknown Interop User Type: ", i3));
                        }
                    } else {
                        if (pendingRecipient.A0N) {
                            return C05F.A0Y;
                        }
                        return C05F.A0j;
                    }
                } else if (!pendingRecipient.A0H) {
                    if (!A0T() && pendingRecipient.A04 != FollowStatus.A05 && !pendingRecipient.getId().equals(str)) {
                        if (!z) {
                            return C05F.A01;
                        }
                        if (pendingRecipient.A0K) {
                            return C05F.A0N;
                        }
                        return C05F.A0C;
                    }
                }
                return C05F.A0B;
            }
            throw new IllegalStateException("Unknown Thread Interop Type");
        }
        return C05F.A00;
    }

    public final String A07() {
        String str;
        String str2;
        DiscoverableThreadInfo discoverableThreadInfo = this.A06;
        CreatorBroadcastThreadInfo creatorBroadcastThreadInfo = this.A04;
        if (discoverableThreadInfo != null && (str2 = discoverableThreadInfo.A02) != null) {
            return str2;
        }
        if (creatorBroadcastThreadInfo != null && (str = creatorBroadcastThreadInfo.A05) != null) {
            return str;
        }
        return null;
    }

    public final String A08() {
        InterfaceC83713oG interfaceC83713oG = this.A09;
        if (interfaceC83713oG instanceof InterfaceC83733oI) {
            InterfaceC83733oI interfaceC83733oI = (InterfaceC83733oI) interfaceC83713oG;
            C14360o3.A0B(interfaceC83733oI, 0);
            if (interfaceC83733oI instanceof C83693oE) {
                return AbstractC1345466e.A01(interfaceC83733oI).A00;
            }
            if (interfaceC83733oI instanceof MsysThreadId) {
                Long l = AbstractC1345466e.A03(interfaceC83733oI).A02;
                if (l == null) {
                    return "null";
                }
                return l.toString();
            }
            return null;
        }
        return null;
    }

    public final ArrayList A0B() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.A0Q.iterator();
        while (it.hasNext()) {
            arrayList.add(((PendingRecipient) it.next()).getId());
        }
        return arrayList;
    }

    public final ArrayList A0C() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.A0Q.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(Long.parseLong(((PendingRecipient) it.next()).getId())));
        }
        return arrayList;
    }

    public final void A0D() {
        if (this.A09 == null) {
            this.A09 = new C122145g6(this.A0Q);
        }
    }

    public final boolean A0E() {
        Integer num = this.A0D;
        if (num != null) {
            if (num.intValue() != 1) {
                return false;
            }
            return true;
        }
        Iterator it = this.A0Q.iterator();
        while (it.hasNext()) {
            if (((PendingRecipient) it.next()).A02 == 1) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0F() {
        if (this.A0Q.size() == 1) {
            if (((PendingRecipient) this.A0Q.get(0)).A0H || ((PendingRecipient) this.A0Q.get(0)).A01 == 3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A0G() {
        if (this.A0Q.size() != 1 || !((PendingRecipient) this.A0Q.get(0)).A0K) {
            return false;
        }
        return true;
    }

    public final boolean A0H() {
        if (this.A04 == null && this.A05 == null && this.A06 == null) {
            return false;
        }
        return true;
    }

    public final boolean A0I() {
        Boolean bool = this.A0B;
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean A0K() {
        InterfaceC83713oG interfaceC83713oG = this.A09;
        if ((interfaceC83713oG == null || !(interfaceC83713oG instanceof InterfaceC2056098k)) && !C4GR.A05(this.A01)) {
            return false;
        }
        return true;
    }

    public final boolean A0L() {
        if (this.A0Q.size() != 1 || ((PendingRecipient) this.A0Q.get(0)).A01 != 1) {
            return false;
        }
        return true;
    }

    public final boolean A0M() {
        if (this.A0Q.size() > 1 || A0I() || (this.A0Q.size() == 1 && this.A01 == 47)) {
            return true;
        }
        return false;
    }

    public final boolean A0N() {
        if (this.A0Q.size() != 1 || !((PendingRecipient) this.A0Q.get(0)).A0T) {
            return false;
        }
        return true;
    }

    public final boolean A0P() {
        if (this.A0Q.size() != 1 || !((PendingRecipient) this.A0Q.get(0)).A0V) {
            return false;
        }
        return true;
    }

    public final boolean A0Q() {
        if (this.A0Q.size() == 1) {
            if (((PendingRecipient) this.A0Q.get(0)).A0X || C2I7.A00(((PendingRecipient) this.A0Q.get(0)).A0B, "64528677628")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A0S() {
        if (this.A0R && this.A0Q.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean A0T() {
        InterfaceC83713oG interfaceC83713oG = this.A09;
        if (interfaceC83713oG != null) {
            if (interfaceC83713oG instanceof MsysThreadId) {
                return true;
            }
            if (interfaceC83713oG instanceof C83693oE) {
                return !TextUtils.isEmpty(((C83693oE) interfaceC83713oG).A00);
            }
            if (!(interfaceC83713oG instanceof C23974Ak9) && !(interfaceC83713oG instanceof C122145g6)) {
                throw new IllegalStateException(AnonymousClass001.A0R("Unknow ThreadTarget implementation: ", interfaceC83713oG.toString()));
            }
        }
        return false;
    }

    public final boolean A0U() {
        if (this.A0Q.size() != 1 || !((PendingRecipient) this.A0Q.get(0)).A0b) {
            return false;
        }
        return true;
    }

    public final boolean A0V() {
        if (this.A0Q.size() != 1 || !((PendingRecipient) this.A0Q.get(0)).A0c) {
            return false;
        }
        return true;
    }

    @Override // com.instagram.model.direct.DirectSearchResult
    public final String AEL() {
        double d;
        Double d2;
        Boolean bool;
        boolean z = false;
        String str = this.A0J;
        String A09 = A09();
        Boolean valueOf = Boolean.valueOf(A0M());
        DirectShareTargetLoggingInfo directShareTargetLoggingInfo = this.A08;
        if (directShareTargetLoggingInfo != null && (bool = directShareTargetLoggingInfo.A00) != null && bool.booleanValue()) {
            z = true;
        }
        Boolean valueOf2 = Boolean.valueOf(z);
        if (directShareTargetLoggingInfo != null && (d2 = directShareTargetLoggingInfo.A01) != null) {
            d = d2.doubleValue();
        } else {
            d = 0.0d;
        }
        return StringFormatUtil.formatStrLocaleSafe("| %-30s | name: %-50s | unique key %-30s| is group: %-10s| is server result: %-10s| rank score: %.2f  |", "DirectShareTarget", str, A09, valueOf, valueOf2, Double.valueOf(d));
    }

    public final int hashCode() {
        boolean z = this.A0R;
        int i = 0;
        Iterator it = this.A0Q.iterator();
        while (it.hasNext()) {
            i ^= it.next().hashCode();
        }
        return ((z ? 1 : 0) * 31) + i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x004c, code lost:
    
        if (r1 == false) goto L9;
     */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(android.os.Parcel r3, int r4) {
        /*
            r2 = this;
            java.util.List r0 = r2.A0Q
            r3.writeTypedList(r0)
            java.lang.String r0 = r2.A0I
            r3.writeString(r0)
            java.lang.String r0 = r2.A0J
            r3.writeString(r0)
            boolean r0 = r2.A0R
            byte r0 = (byte) r0
            r3.writeByte(r0)
            X.3oG r0 = r2.A09
            X.AbstractC2054897w.A03(r3, r0, r4)
            X.2Dm r0 = r2.A07
            if (r0 != 0) goto L20
            X.2Dm r0 = X.EnumC46982Dm.A05
        L20:
            int r0 = r0.A00
            r3.writeInt(r0)
            com.instagram.direct.model.thread.CreatorSubscriberThreadInfo r0 = r2.A05
            r3.writeParcelable(r0, r4)
            com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r0 = r2.A04
            r3.writeParcelable(r0, r4)
            com.instagram.direct.model.thread.DiscoverableThreadInfo r0 = r2.A06
            r3.writeParcelable(r0, r4)
            java.lang.String r0 = r2.A0G
            r3.writeString(r0)
            int r0 = r2.A00
            r3.writeInt(r0)
            java.lang.String r0 = r2.A0H
            r3.writeString(r0)
            java.lang.Boolean r0 = r2.A0C
            if (r0 == 0) goto L4e
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L4f
        L4e:
            r0 = 0
        L4f:
            r3.writeByte(r0)
            int r0 = r2.A01
            r3.writeInt(r0)
            java.lang.Integer r0 = r2.A0E
            int r0 = r0.intValue()
            r3.writeInt(r0)
            com.instagram.common.typedurl.ImageUrl r0 = r2.A02
            r3.writeParcelable(r0, r4)
            java.lang.String r0 = r2.A0O
            r3.writeString(r0)
            boolean r0 = r2.A0U
            byte r0 = (byte) r0
            r3.writeByte(r0)
            java.lang.String r0 = r2.A0N
            r3.writeString(r0)
            java.lang.String r0 = r2.A0F
            r3.writeString(r0)
            com.instagram.direct.model.thread.ChannelsContextLine r0 = r2.A03
            r3.writeParcelable(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.direct.DirectShareTarget.writeToParcel(android.os.Parcel, int):void");
    }

    public final String A05() {
        if (!A0I() && !this.A0S) {
            if (this.A0Q.size() == 1 && !A0T()) {
                return ((PendingRecipient) this.A0Q.get(0)).A09;
            }
            if (!A0T()) {
                return null;
            }
        }
        return this.A0H;
    }

    public final String A06() {
        if (A0R() && !A0S()) {
            PendingRecipient pendingRecipient = (PendingRecipient) this.A0Q.get(0);
            if (pendingRecipient.A01 == 1) {
                return String.valueOf(pendingRecipient.A08);
            }
        }
        return A09();
    }

    public final String A09() {
        if (A0R() && !A0S()) {
            return ((PendingRecipient) this.A0Q.get(0)).getId();
        }
        String A08 = A08();
        if (!TextUtils.isEmpty(A08)) {
            return A08;
        }
        return String.valueOf(hashCode());
    }

    public final String A0A() {
        if (A0R() && this.A0Q.size() == 1) {
            return ((PendingRecipient) this.A0Q.get(0)).A0C;
        }
        return null;
    }

    public final boolean A0J() {
        if (!A0O()) {
            return false;
        }
        int i = ((PendingRecipient) this.A0Q.get(0)).A00;
        if (i == 1 || i == 2 || i == 4) {
            return true;
        }
        return false;
    }

    public final boolean A0O() {
        if (!A0S() && (this.A0Q.size() != 1 || ((PendingRecipient) this.A0Q.get(0)).A01 != 0)) {
            return false;
        }
        return true;
    }

    public final boolean A0R() {
        if (!A0M() && this.A0R) {
            return true;
        }
        return false;
    }

    public final boolean A0W() {
        if (A0O() && this.A0Q.size() == 1) {
            if (((PendingRecipient) this.A0Q.get(0)).A0E || ((PendingRecipient) this.A0Q.get(0)).A0G) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A0Z(String str) {
        if (!A0S() && (this.A0Q.size() != 1 || !((PendingRecipient) this.A0Q.get(0)).getId().equals(str))) {
            return false;
        }
        return true;
    }

    public final boolean A0a(boolean z) {
        if (!A0O() || this.A0Q.size() != 1) {
            return false;
        }
        PendingRecipient pendingRecipient = (PendingRecipient) this.A0Q.get(0);
        if (!A0J()) {
            return false;
        }
        if (!pendingRecipient.A0O && !z) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r2.A0I != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0b(boolean r5) {
        /*
            r4 = this;
            boolean r0 = r4.A0O()
            r3 = 0
            if (r0 == 0) goto L28
            java.util.List r0 = r4.A0Q
            java.lang.Object r2 = r0.get(r3)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r2 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r2
            boolean r0 = r4.A0J()
            if (r0 == 0) goto L28
            if (r5 == 0) goto L1c
            boolean r0 = r2.A0I
            r1 = 0
            if (r0 == 0) goto L1d
        L1c:
            r1 = 1
        L1d:
            boolean r0 = r2.A0d
            if (r0 == 0) goto L28
            boolean r0 = r2.A0O
            if (r0 != 0) goto L27
            if (r1 == 0) goto L28
        L27:
            r3 = 1
        L28:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.direct.DirectShareTarget.A0b(boolean):boolean");
    }

    public DirectShareTarget() {
        this.A00 = Integer.MIN_VALUE;
        this.A01 = 0;
        this.A0E = 0;
        this.A0K = "";
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.instagram.model.direct.DirectShareTargetLoggingInfo, java.lang.Object] */
    public DirectShareTarget(EnumC46982Dm enumC46982Dm, InterfaceC83713oG interfaceC83713oG, Boolean bool, Double d, String str, String str2, List list, boolean z, boolean z2) {
        this.A00 = Integer.MIN_VALUE;
        this.A01 = 0;
        this.A0E = 0;
        this.A0K = "";
        this.A0Q = list;
        this.A09 = interfaceC83713oG;
        this.A0I = str;
        this.A0J = str;
        this.A0R = z;
        ?? obj = new Object();
        obj.A01 = d;
        obj.A00 = bool;
        this.A08 = obj;
        this.A07 = enumC46982Dm;
        this.A0T = z2;
        this.A0F = str2;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.instagram.model.direct.DirectShareTargetLoggingInfo, java.lang.Object] */
    public DirectShareTarget(InterfaceC83713oG interfaceC83713oG, PendingRecipient pendingRecipient) {
        this.A00 = Integer.MIN_VALUE;
        this.A01 = 0;
        this.A0E = 0;
        this.A0K = "";
        this.A0Q = Collections.singletonList(pendingRecipient);
        this.A0I = pendingRecipient.A0C;
        this.A0J = pendingRecipient.A0A;
        this.A0R = true;
        ?? obj = new Object();
        obj.A01 = null;
        obj.A00 = true;
        this.A08 = obj;
        interfaceC83713oG.getClass();
        this.A09 = interfaceC83713oG;
    }

    public DirectShareTarget(InterfaceC83713oG interfaceC83713oG, Boolean bool, Double d, String str, List list, boolean z) {
        this(null, null, null, null, null, interfaceC83713oG, bool, null, d, null, null, null, str, null, null, null, null, list, z, false);
    }

    public DirectShareTarget(InterfaceC83713oG interfaceC83713oG, Integer num, String str, String str2, List list) {
        this.A00 = Integer.MIN_VALUE;
        this.A01 = 0;
        this.A0E = 0;
        this.A0K = "";
        this.A0Q = list;
        this.A09 = interfaceC83713oG;
        this.A0I = str;
        this.A0J = str;
        this.A0G = str2;
        this.A00 = num != null ? num.intValue() : Integer.MIN_VALUE;
    }

    public DirectShareTarget(InterfaceC83713oG interfaceC83713oG, String str, List list, boolean z) {
        this(interfaceC83713oG, null, null, str, list, z);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.instagram.model.direct.DirectShareTargetLoggingInfo, java.lang.Object] */
    public DirectShareTarget(ChannelsContextLine channelsContextLine, CreatorBroadcastThreadInfo creatorBroadcastThreadInfo, CreatorSubscriberThreadInfo creatorSubscriberThreadInfo, DiscoverableThreadInfo discoverableThreadInfo, EnumC46982Dm enumC46982Dm, InterfaceC83713oG interfaceC83713oG, Boolean bool, Boolean bool2, Double d, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, List list, boolean z, boolean z2) {
        int i;
        this.A00 = Integer.MIN_VALUE;
        this.A01 = 0;
        this.A0E = 0;
        this.A0K = "";
        this.A0Q = list;
        interfaceC83713oG.getClass();
        this.A09 = interfaceC83713oG;
        this.A0I = str;
        this.A0J = str;
        this.A0R = z;
        ?? obj = new Object();
        obj.A01 = d;
        obj.A00 = bool;
        this.A08 = obj;
        this.A07 = enumC46982Dm;
        this.A05 = creatorSubscriberThreadInfo;
        this.A04 = creatorBroadcastThreadInfo;
        this.A06 = discoverableThreadInfo;
        this.A0G = str2;
        this.A00 = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.A0H = str3;
        this.A0C = bool2;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = 0;
        }
        this.A01 = i;
        this.A0E = Integer.valueOf(num3 != null ? num3.intValue() : 0);
        this.A0O = str4;
        this.A0U = z2;
        this.A0F = str5;
        this.A03 = channelsContextLine;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.instagram.model.direct.DirectShareTargetLoggingInfo, java.lang.Object] */
    public DirectShareTarget(MsysThreadId msysThreadId, Boolean bool, String str, List list, int i) {
        Integer valueOf = Integer.valueOf(i);
        this.A00 = Integer.MIN_VALUE;
        this.A01 = 0;
        this.A0E = 0;
        this.A0K = "";
        this.A0Q = list;
        this.A0I = str;
        this.A0J = str;
        this.A0R = true;
        this.A0D = valueOf;
        ?? obj = new Object();
        obj.A01 = null;
        obj.A00 = null;
        this.A08 = obj;
        this.A09 = msysThreadId;
        this.A0A = bool;
        A0D();
    }

    @Deprecated
    public DirectShareTarget(PendingRecipient pendingRecipient) {
        this(new C122145g6(Arrays.asList(pendingRecipient)), pendingRecipient);
    }

    public DirectShareTarget(User user) {
        this(new PendingRecipient(user));
    }

    public DirectShareTarget(User user, boolean z) {
        this.A00 = Integer.MIN_VALUE;
        this.A01 = 0;
        this.A0E = 0;
        this.A0K = "";
        PendingRecipient pendingRecipient = new PendingRecipient(user);
        this.A0Q = Collections.singletonList(pendingRecipient);
        this.A0I = pendingRecipient.A0C;
        this.A0J = pendingRecipient.A0A;
        this.A0R = true;
        this.A0B = false;
        A0D();
    }

    public DirectShareTarget(String str, String str2) {
        this.A00 = Integer.MIN_VALUE;
        this.A01 = 0;
        this.A0E = 0;
        this.A0S = true;
        this.A0I = str;
        this.A0K = str2;
        this.A0Q = Collections.singletonList(new PendingRecipient(str));
    }
}
