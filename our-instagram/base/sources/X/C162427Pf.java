package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.7Pf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162427Pf {
    public final boolean A03(C83403nh c83403nh) {
        ImmutableList A0H = c83403nh.A0H();
        if (A0H != null && !A0H.isEmpty()) {
            String str = ((C910143t) AbstractC001800i.A0I(A0H)).A0w;
            if (str != null) {
                android.net.Uri A03 = AbstractC08820cl.A03(str);
                C14360o3.A07(A03);
                String queryParameter = A03.getQueryParameter("collection_type");
                if (C14360o3.A0K(queryParameter, "challenges") || (C14360o3.A0K(queryParameter, "daily_prompt") && ((C910143t) AbstractC001800i.A0I(A0H)).A02 == 8)) {
                    return true;
                }
                return false;
            }
        } else {
            A00();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A04(C83403nh c83403nh) {
        ImmutableList A0H = c83403nh.A0H();
        if (A0H != null && !A0H.isEmpty()) {
            if (((C910143t) A0H.get(0)).A02 == 8) {
                return true;
            }
            return false;
        }
        A00();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A05(C83403nh c83403nh) {
        ImmutableList A0H = c83403nh.A0H();
        if (A0H != null && !A0H.isEmpty()) {
            if (((C910143t) A0H.get(0)).A02 == 11 && !C910143t.A00((C910143t) A0H.get(0))) {
                return true;
            }
            return false;
        }
        A00();
        return false;
    }

    public static final void A00() {
        C18950wb.A01.AEp("Xma items should not be null", 20134884).report();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean A01(C83403nh c83403nh) {
        ImmutableList A0H = c83403nh.A0H();
        if (A0H != null && !A0H.isEmpty()) {
            if (((C910143t) A0H.get(0)).A02 == 10) {
                return true;
            }
            return false;
        }
        A00();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean A02(C83403nh c83403nh) {
        ImmutableList A0H = c83403nh.A0H();
        if (A0H != null && !A0H.isEmpty()) {
            if ((A0H.size() == 1 || ((C910143t) A0H.get(0)).A02 == 9 || C910143t.A00((C910143t) A0H.get(0))) && !c83403nh.CSo()) {
                return true;
            }
            return false;
        }
        A00();
        return false;
    }
}
