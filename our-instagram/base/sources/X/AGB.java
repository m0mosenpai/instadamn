package X;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class AGB {
    public String A00;
    public String A01;
    public String A02;
    public List A03;

    public AGB(InterfaceC174197pB interfaceC174197pB) {
        C14360o3.A0B(interfaceC174197pB, 1);
        List emptyList = Collections.emptyList();
        C14360o3.A07(emptyList);
        this.A03 = emptyList;
        this.A01 = interfaceC174197pB.getId();
        this.A02 = interfaceC174197pB.getUri();
        this.A00 = interfaceC174197pB.AjY();
        this.A03 = interfaceC174197pB.C2r();
    }

    public AGB() {
        List emptyList = Collections.emptyList();
        C14360o3.A07(emptyList);
        this.A03 = emptyList;
    }
}
