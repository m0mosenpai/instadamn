package X;

import android.util.LruCache;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7et, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167987et extends C0T6 {
    public final LruCache A00;
    public final List A01;
    public final List A02;

    /* JADX WARN: Multi-variable type inference failed */
    public C167987et() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C167987et) {
                C167987et c167987et = (C167987et) obj;
                if (!C14360o3.A0K(this.A02, c167987et.A02) || !C14360o3.A0K(this.A01, c167987et.A01) || !C14360o3.A0K(this.A00, c167987et.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode();
    }

    public /* synthetic */ C167987et(LruCache lruCache, List list, List list2, DefaultConstructorMarker defaultConstructorMarker, int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LruCache lruCache2 = new LruCache(100);
        this.A02 = arrayList;
        this.A01 = arrayList2;
        this.A00 = lruCache2;
    }

    public final List A00() {
        List list = this.A02;
        if (!list.isEmpty()) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC39800HlA.A00((C32071E6x) it.next()));
                }
                return arrayList;
            } catch (IOException unused) {
                C0w9.A01.EmN(AbstractC43591JPw.A00(241), AbstractC43591JPw.A00(626));
            }
        }
        return C16930sl.A00;
    }

    public final void A01(String str) {
        C9ZB c9zb = (C9ZB) this.A00.get(str);
        List list = this.A02;
        int i = c9zb.A00;
        String str2 = c9zb.A01;
        list.add(new C32071E6x(i, str2, 3));
        List list2 = this.A01;
        C14360o3.A0B(str2, 2);
        list2.add(new H2Z(str2, i, false));
    }
}
