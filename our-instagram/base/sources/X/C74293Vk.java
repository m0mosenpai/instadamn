package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.3Vk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C74293Vk extends C40781ul implements InterfaceC55612h1, InterfaceC74303Vl {
    public C74433Vz A01;
    public C5GM A02;
    public Boolean A03;
    public String A04;
    public HashMap A05;
    public List A06;
    public boolean A07;
    public boolean A08;
    public long A00 = -1;
    public long A09 = -1;

    @Override // X.InterfaceC74303Vl
    public final boolean CQT() {
        return false;
    }

    @Override // X.InterfaceC55612h1
    public final /* synthetic */ void EQh(String str) {
    }

    @Override // X.InterfaceC55612h1
    public final long AjZ() {
        return this.A09;
    }

    @Override // X.InterfaceC55612h1
    public final long Ajf() {
        return this.A00;
    }

    @Override // X.InterfaceC74303Vl
    public final boolean CQG() {
        return this.A07;
    }

    @Override // X.InterfaceC55612h1
    public final boolean CR4() {
        if (this.A00 == -1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return this.A04;
    }

    @Override // X.InterfaceC55612h1
    public final void EQg(long j) {
        this.A09 = j;
    }

    @Override // X.InterfaceC55612h1
    public final void EQi(long j) {
        this.A00 = j;
    }
}
