package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Vj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74283Vj extends C74293Vk {
    public long A00;
    public C110434yF A01;
    public C41155IJu A02;
    public C47K A03;
    public C84543q2 A04;
    public C41018IEn A05;
    public C3XF A06;
    public C3XB A07;
    public C5GM A08;
    public Boolean A09 = false;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Integer A0D;
    public Integer A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public List A0J;
    public List A0K;
    public List A0L;
    public Map A0M;
    public boolean A0N;
    public boolean A0O;

    public final List A00() {
        List unmodifiableList;
        List list = this.A0L;
        if (list == null || (unmodifiableList = Collections.unmodifiableList(list)) == null) {
            return C16930sl.A00;
        }
        return unmodifiableList;
    }

    public final void A01(List list) {
        this.A0L = new ArrayList(list);
    }

    public final boolean A02() {
        C1XV c1xv;
        C3XG c3xg;
        List list = this.A0L;
        if (list != null && (c3xg = (C3XG) AbstractC001800i.A0J(list)) != null) {
            c1xv = c3xg.A06;
        } else {
            c1xv = null;
        }
        if (c1xv != C1XV.A0F) {
            return false;
        }
        return true;
    }

    @Override // X.C40781ul, X.C40791um, X.InterfaceC40801un
    public final boolean isOk() {
        if (!super.isOk() && this.mStatusCode != 204) {
            return false;
        }
        return true;
    }
}
