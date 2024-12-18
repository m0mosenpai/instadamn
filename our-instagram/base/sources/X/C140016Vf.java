package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Vf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140016Vf {
    public final AnonymousClass630 A00;
    public volatile Integer A01 = C05F.A00;
    public volatile List A02;

    public final synchronized void A01(Object obj) {
        if (this.A01 != C05F.A0C) {
            if (this.A01 == C05F.A00) {
                if (this.A02 == null) {
                    this.A02 = new ArrayList();
                }
                List list = this.A02;
                if (list != null) {
                    list.add(obj);
                }
            } else {
                AnonymousClass630 anonymousClass630 = this.A00;
                C6DY c6dy = (C6DY) obj;
                if (AbstractC79383gk.A03()) {
                    anonymousClass630.A0D(c6dy);
                } else {
                    AnonymousClass630.A0P.post(new RunnableC71568WwI(anonymousClass630, c6dy, this));
                }
            }
        }
    }

    public final void A00(Integer num) {
        String str;
        String str2;
        List list;
        AbstractC79383gk.A02("Handler's active status can only be changed on the main thread");
        Integer num2 = this.A01;
        if (num2 != num) {
            int intValue = num2.intValue();
            int intValue2 = num.intValue();
            if (intValue <= intValue2) {
                synchronized (this) {
                    this.A01 = num;
                    List list2 = this.A02;
                    if (list2 != null) {
                        list = AbstractC001800i.A0a(list2);
                    } else {
                        list = null;
                    }
                    List list3 = this.A02;
                    if (list3 != null) {
                        list3.clear();
                    }
                    this.A02 = null;
                }
                if (list != null && num == C05F.A01) {
                    for (Object obj : list) {
                        AnonymousClass630 anonymousClass630 = this.A00;
                        C6DY c6dy = (C6DY) obj;
                        if (AbstractC79383gk.A03()) {
                            anonymousClass630.A0D(c6dy);
                        } else {
                            AnonymousClass630.A0P.post(new RunnableC71568WwI(anonymousClass630, c6dy, this));
                        }
                    }
                    return;
                }
                return;
            }
            if (2 - intValue != 0) {
                str = "PENDING";
            } else {
                str = "INACTIVE";
            }
            if (1 - intValue2 != 0) {
                str2 = "INACTIVE";
            } else {
                str2 = "ACTIVE";
            }
            throw new IllegalStateException(AnonymousClass001.A0u("Invalid transition from ", str, " to ", str2));
        }
    }

    public C140016Vf(AnonymousClass630 anonymousClass630) {
        this.A00 = anonymousClass630;
    }
}
