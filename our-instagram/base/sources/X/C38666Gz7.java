package X;

/* renamed from: X.Gz7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38666Gz7 extends C0T6 {
    public final float A00;
    public final int A01;
    public final C26082BgB A02;
    public final InterfaceC65702y7 A03;
    public final JMX A04;
    public final InterfaceC60442pS A05;
    public final C75113Zb A06;
    public final C76733cL A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38666Gz7) {
                C38666Gz7 c38666Gz7 = (C38666Gz7) obj;
                if (!C14360o3.A0K(this.A07, c38666Gz7.A07) || !C14360o3.A0K(this.A06, c38666Gz7.A06) || Float.compare(this.A00, c38666Gz7.A00) != 0 || !C14360o3.A0K(this.A04, c38666Gz7.A04) || this.A01 != c38666Gz7.A01 || !C14360o3.A0K(this.A05, c38666Gz7.A05) || !C14360o3.A0K(this.A03, c38666Gz7.A03) || !C14360o3.A0K(this.A02, c38666Gz7.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A05, (((AbstractC166997dE.A00(AbstractC166997dE.A0J(this.A06, AbstractC166987dD.A0G(this.A07)), this.A00) + AbstractC167017dG.A0M(this.A04)) * 31) + this.A01) * 31)));
    }

    public C38666Gz7(C26082BgB c26082BgB, InterfaceC65702y7 interfaceC65702y7, JMX jmx, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, C76733cL c76733cL, float f, int i) {
        this.A07 = c76733cL;
        this.A06 = c75113Zb;
        this.A00 = f;
        this.A04 = jmx;
        this.A01 = i;
        this.A05 = interfaceC60442pS;
        this.A03 = interfaceC65702y7;
        this.A02 = c26082BgB;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MediaGuideUiState(lazyMediaFetcher=");
        A1C.append(this.A07);
        A1C.append(AbstractC43591JPw.A00(57));
        A1C.append(this.A06);
        A1C.append(AbstractC43591JPw.A00(56));
        A1C.append(this.A00);
        A1C.append(", guideFeedMetadata=");
        A1C.append(this.A04);
        A1C.append(AbstractC43591JPw.A00(58));
        A1C.append(this.A01);
        A1C.append(", insightsHost=");
        A1C.append(this.A05);
        A1C.append(AbstractC111324zv.A00(1422));
        A1C.append(this.A03);
        A1C.append(AbstractC43591JPw.A00(23));
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
