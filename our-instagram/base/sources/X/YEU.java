package X;

/* loaded from: classes12.dex */
public final class YEU implements InterfaceC57632kc {
    public final /* synthetic */ YOy A00;
    public final /* synthetic */ C106744rW A01;
    public final /* synthetic */ String A02;

    public YEU(YOy yOy, C106744rW c106744rW, String str) {
        this.A01 = c106744rW;
        this.A00 = yOy;
        this.A02 = str;
    }

    @Override // X.InterfaceC57632kc
    public final void DEF(Exception exc) {
        this.A01.A02.post(new YGU(this));
    }

    @Override // X.InterfaceC57632kc
    public final /* bridge */ /* synthetic */ void onResult(Object obj) {
        this.A01.A02.post(new RunnableC73511YHb(this, (C69479Vo2) obj));
    }
}
