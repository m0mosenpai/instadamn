package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7hz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC169857hz extends AbstractC169867i0 implements C2VB, C2VD, InterfaceC50852Vg, Cloneable {
    public static final AtomicInteger A0A = new AtomicInteger(0);
    public int A00;
    public AbstractC169857hz A01;
    public C169827hw A02;
    public String A03;
    public String A04;
    public List A05;
    public Map A06;
    public boolean A07;
    public final int A08 = A0A.getAndIncrement();
    public final String A09;

    public static void A01(AbstractC169857hz abstractC169857hz) {
        abstractC169857hz.A07 = true;
        AbstractC169857hz abstractC169857hz2 = abstractC169857hz.A01;
        if (abstractC169857hz2 != null) {
            A01(abstractC169857hz2);
        }
    }

    @Override // X.C2VD
    public final C2VC B2i() {
        return this;
    }

    public static HashMap A00(AbstractC169857hz abstractC169857hz) {
        HashMap hashMap = new HashMap();
        if (abstractC169857hz != null) {
            List list = abstractC169857hz.A05;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    AbstractC169857hz abstractC169857hz2 = (AbstractC169857hz) list.get(i);
                    hashMap.put(abstractC169857hz2.A03, new Pair(abstractC169857hz2, Integer.valueOf(i)));
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Children of current section ");
                sb.append(abstractC169857hz);
                sb.append(" is null!");
                throw new IllegalStateException(sb.toString());
            }
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // X.C2VB
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean CTz(X.AbstractC169857hz r4) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC169857hz.CTz(X.7hz):boolean");
    }

    public final String toString() {
        return this.A09;
    }

    public AbstractC169857hz(String str) {
        this.A09 = str;
        this.A04 = str;
    }

    public final AbstractC169857hz A04(boolean z) {
        try {
            AbstractC169857hz abstractC169857hz = (AbstractC169857hz) super.clone();
            if (!z) {
                if (abstractC169857hz.A05 != null) {
                    abstractC169857hz.A05 = new ArrayList();
                }
                abstractC169857hz.A00 = 0;
                abstractC169857hz.A07 = false;
                abstractC169857hz.A06 = null;
            }
            return abstractC169857hz;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
