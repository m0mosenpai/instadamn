package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.HashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.1OW, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1OW implements C1OX {
    public int A00;
    public long A01;
    public JTa A02;
    public C114675Fx A03;
    public C114675Fx A04;
    public String A05;
    public String A06;
    public String A07;
    public java.util.Set A08;

    /* JADX WARN: Multi-variable type inference failed */
    public C1OW() {
        this(null, 0 == true ? 1 : 0, 1);
    }

    public DirectThreadKey A01() {
        return null;
    }

    public abstract String A02();

    public C1OW(JTa jTa) {
        this.A02 = jTa;
        this.A05 = jTa.A03;
        this.A01 = System.currentTimeMillis();
        this.A08 = new HashSet();
        this.A06 = "queued";
    }

    @Override // X.C1OX
    public final String getTypeName() {
        return A02();
    }

    public /* synthetic */ C1OW(JTa jTa, DefaultConstructorMarker defaultConstructorMarker, int i) {
        this(new JTa(null, null, String.valueOf(C0HN.A00()), null, null, null, false, false, false, false, false));
    }
}
