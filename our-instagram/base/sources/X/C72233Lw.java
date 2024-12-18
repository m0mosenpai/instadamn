package X;

import com.instagram.search.common.analytics.SearchContext;
import java.util.HashMap;

/* renamed from: X.3Lw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72233Lw extends C0T6 implements InterfaceC41141vN {
    public AnonymousClass341 A00;
    public C3AG A01;
    public SearchContext A02;
    public HashMap A03;
    public final C38321qM A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C72233Lw) {
                C72233Lw c72233Lw = (C72233Lw) obj;
                if (!C14360o3.A0K(this.A04, c72233Lw.A04) || !C14360o3.A0K(this.A02, c72233Lw.A02) || this.A00 != c72233Lw.A00 || !C14360o3.A0K(this.A01, c72233Lw.A01) || !C14360o3.A0K(this.A03, c72233Lw.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A04.hashCode() * 31) + this.A02.hashCode()) * 31;
        AnonymousClass341 anonymousClass341 = this.A00;
        int hashCode2 = (hashCode + (anonymousClass341 == null ? 0 : anonymousClass341.hashCode())) * 31;
        C3AG c3ag = this.A01;
        int hashCode3 = (hashCode2 + (c3ag == null ? 0 : c3ag.hashCode())) * 31;
        HashMap hashMap = this.A03;
        return hashCode3 + (hashMap != null ? hashMap.hashCode() : 0);
    }

    public C72233Lw(C38321qM c38321qM, AnonymousClass341 anonymousClass341, C3AG c3ag, SearchContext searchContext, HashMap hashMap) {
        this.A04 = c38321qM;
        this.A02 = searchContext;
        this.A00 = anonymousClass341;
        this.A01 = c3ag;
        this.A03 = hashMap;
    }
}
