package X;

/* renamed from: X.Gez, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37481Gez extends C1PY {
    public final int A00;

    public C37481Gez(int i) {
        this.A00 = i;
    }

    @Override // X.C1PY
    public final /* bridge */ /* synthetic */ InterfaceC42381xS A02(Integer num, Object obj, int i) {
        switch (this.A00) {
            case 0:
                C37469Gen c37469Gen = (C37469Gen) obj;
                AbstractC167017dG.A1O(c37469Gen, num);
                return new C42970IzM(c37469Gen, num, i);
            case 1:
                C206259Bi c206259Bi = (C206259Bi) obj;
                AbstractC167017dG.A1O(c206259Bi, num);
                return new C38188Gqt(c206259Bi, num, i);
            case 2:
            case 3:
            default:
                C206239Bg c206239Bg = (C206239Bg) obj;
                AbstractC167017dG.A1O(c206239Bg, num);
                return new C37909Gm6(c206239Bg, num, i);
            case 4:
                C37469Gen c37469Gen2 = (C37469Gen) obj;
                AbstractC167017dG.A1O(c37469Gen2, num);
                return new C37456Gea(c37469Gen2, num, i);
        }
    }
}
