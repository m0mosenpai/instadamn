package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import java.util.LinkedHashSet;
import java.util.UUID;

/* renamed from: X.6lu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148246lu {
    public AbstractC223999ui A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final C006802i A04;
    public final String A05;
    public final String A06;
    public final java.util.Set A07;

    public C148246lu(C006802i c006802i, String str, int i) {
        C14360o3.A0B(str, 2);
        C14360o3.A0B(c006802i, 4);
        this.A06 = str;
        this.A03 = i;
        this.A04 = c006802i;
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        this.A05 = obj;
        this.A07 = new LinkedHashSet();
    }

    public static final void A00(C148246lu c148246lu) {
        if (c148246lu.A02 && !c148246lu.A01) {
            C006802i c006802i = c148246lu.A04;
            c006802i.markerAnnotate(129898941, "num_stickers_rendered", 0);
            c006802i.markerEnd(129898941, (short) 3);
            c148246lu.A01 = true;
        }
    }

    public final void A01(String str) {
        String str2;
        java.util.Set set = this.A07;
        if (!set.contains(str)) {
            set.add(str);
            if (set.size() == this.A03 && this.A02 && !this.A01) {
                C006802i c006802i = this.A04;
                c006802i.markerAnnotate(129898941, "num_stickers_rendered", set.size());
                AbstractC223999ui abstractC223999ui = this.A00;
                if (abstractC223999ui != null && (abstractC223999ui instanceof C220689os)) {
                    C220689os c220689os = (C220689os) abstractC223999ui;
                    String str3 = c220689os.A00.A04;
                    String str4 = "";
                    if (str3 == null) {
                        str3 = "";
                    }
                    c006802i.markerAnnotate(129898941, "avatar_revision_id", str3);
                    K8S k8s = c220689os.A00;
                    String str5 = k8s.A03;
                    if (str5 == null) {
                        str5 = "";
                    }
                    c006802i.markerAnnotate(129898941, "avatar_id", str5);
                    String str6 = k8s.A05;
                    if (str6 != null) {
                        str4 = str6;
                    }
                    c006802i.markerAnnotate(129898941, "avatar_style_id", str4);
                    if (k8s.A09) {
                        str2 = "CACHE";
                    } else {
                        str2 = "NETWORK";
                    }
                    c006802i.markerAnnotate(129898941, CacheBehaviorLogger.SOURCE, str2);
                }
                c006802i.markerEnd(129898941, (short) 2);
                this.A01 = true;
            }
        }
    }
}
