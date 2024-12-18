package X;

import com.instagram.realtimeclient.EventRouter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1aL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28821aL {
    public static final List A05 = new ArrayList();
    public static final List A06 = new ArrayList();
    public final C1ZW A00;
    public final C4L1 A01;
    public final Object A02;
    public final List A03;
    public final List A04;

    public final AbstractC1333760g A00(C5lP c5lP, C125205lR c125205lR, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
        AbstractC1333760g c1333960i;
        String str;
        C1ZX A00;
        Exception exc;
        ArrayList A0S;
        Iterator<Map.Entry<String, C4L3>> it = this.A01.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                Map.Entry<String, C4L3> next = it.next();
                str = next.getKey();
                C4L3 value = next.getValue();
                Map match = EventRouter.match(str, c125205lR.A01);
                if (match != null) {
                    synchronized (this.A02) {
                        A0S = AbstractC001800i.A0S(this.A03, this.A04);
                    }
                    c1333960i = value.E6D(c5lP, c125205lR, A0S, match, interfaceC16620sF, interfaceC16620sF2, z);
                    if (!(c1333960i instanceof C1333860h)) {
                        break;
                    }
                }
            } else {
                String str2 = c125205lR.A00;
                C14360o3.A06(str2);
                String str3 = c125205lR.A01;
                C14360o3.A06(str3);
                c1333960i = new C1333960i(str2, str3);
                str = null;
                break;
            }
        }
        if (c1333960i instanceof C1333960i) {
            A00 = this.A00.A00(C05F.A02, 817891655, 0, false);
            A00.A03("result", "Result.Processed.NoMatch");
            C1333960i c1333960i2 = (C1333960i) c1333960i;
            A00.A03("reason", AnonymousClass001.A0u("No match for operation: op=", c1333960i2.A00, " path=", c1333960i2.A01));
        } else {
            if (c1333960i instanceof C1334060j) {
                A00 = this.A00.A00(C05F.A02, 817891655, 0, false);
                A00.A03("result", "Result.Processed.Failure");
                if (str != null) {
                    A00.A03("template", str);
                }
                C1334060j c1334060j = (C1334060j) c1333960i;
                A00.A03("category", c1334060j.A01);
                A00.A03("reason", c1334060j.A02);
                exc = c1334060j.A00;
            } else {
                if (c1333960i instanceof C1334160k) {
                    A00 = this.A00.A00(C05F.A02, 817891655, 0, false);
                    A00.A03("result", "Result.Dropped.Failure");
                    if (str != null) {
                        A00.A03("template", str);
                    }
                    C1334160k c1334160k = (C1334160k) c1333960i;
                    A00.A03("category", c1334160k.A01);
                    A00.A03("reason", c1334160k.A02);
                    exc = c1334160k.A00;
                }
                return c1333960i;
            }
            A00.A05(exc);
        }
        A00.A00();
        return c1333960i;
    }

    public C28821aL(C1ZW c1zw, C4L1 c4l1, List list) {
        this.A01 = c4l1;
        this.A04 = list;
        this.A00 = c1zw;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        C14360o3.A07(synchronizedList);
        this.A03 = synchronizedList;
        this.A02 = new Object();
    }
}
