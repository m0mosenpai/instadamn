package X;

import com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IMx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41232IMx {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final H6V A03;
    public final InterfaceC09390do A04;

    public C41232IMx(H6V h6v) {
        C14360o3.A0B(h6v, 1);
        this.A03 = h6v;
        this.A04 = AbstractC09440dt.A01(new C50152MDf(this, 41));
    }

    public final boolean A01() {
        boolean z = false;
        if (AbstractC167007dF.A1X(this.A03.A00, INLINE_SURVEY_QUESTION_TYPES.A04)) {
            String str = this.A00;
            if (str == null || str.length() == 0) {
                z = true;
            }
            return !z;
        }
        List A0n = AbstractC31171DnF.A0n(this.A04);
        if (!(A0n instanceof Collection) || !A0n.isEmpty()) {
            Iterator it = A0n.iterator();
            while (it.hasNext()) {
                if (((C41009IEe) it.next()).A00) {
                    return true;
                }
            }
        }
        return false;
    }

    public final ArrayList A00() {
        ArrayList A1E = AbstractC166987dD.A1E();
        List A0n = AbstractC31171DnF.A0n(this.A04);
        ArrayList A1E2 = AbstractC166987dD.A1E();
        for (Object obj : A0n) {
            if (((C41009IEe) obj).A00) {
                A1E2.add(obj);
            }
        }
        Iterator it = A1E2.iterator();
        while (it.hasNext()) {
            A1E.add(((C41009IEe) it.next()).A01.getId());
        }
        String str = this.A00;
        if (str != null) {
            A1E.add(str);
        }
        return A1E;
    }
}
