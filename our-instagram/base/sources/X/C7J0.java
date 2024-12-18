package X;

import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7J0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7J0 extends C7J1 {
    public C129095sU A00;
    public final ThreadFetchReason A01;
    public final String A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final /* synthetic */ C28811aJ A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7J0(ThreadFetchReason threadFetchReason, InterfaceC2056798r interfaceC2056798r, C28811aJ c28811aJ, Boolean bool, List list) {
        super(interfaceC2056798r, c28811aJ);
        this.A06 = c28811aJ;
        this.A02 = null;
        this.A04 = true;
        this.A03 = Collections.unmodifiableList(list);
        this.A05 = bool.booleanValue();
        this.A01 = threadFetchReason;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7J0(ThreadFetchReason threadFetchReason, InterfaceC2056798r interfaceC2056798r, C28811aJ c28811aJ, DirectThreadKey directThreadKey) {
        super(interfaceC2056798r, c28811aJ);
        ArrayList arrayList;
        this.A06 = c28811aJ;
        this.A02 = directThreadKey.A00;
        this.A04 = true;
        List list = directThreadKey.A02;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list);
        }
        this.A03 = arrayList;
        this.A05 = false;
        this.A01 = threadFetchReason;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7J0(ThreadFetchReason threadFetchReason, InterfaceC2056798r interfaceC2056798r, C28811aJ c28811aJ, String str, boolean z) {
        super(interfaceC2056798r, c28811aJ);
        this.A06 = c28811aJ;
        this.A04 = z;
        this.A02 = str;
        this.A03 = null;
        this.A05 = false;
        this.A01 = threadFetchReason;
    }
}
