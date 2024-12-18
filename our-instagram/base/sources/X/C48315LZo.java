package X;

import android.widget.ImageView;

/* renamed from: X.LZo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48315LZo implements InterfaceC66482zP {
    public int A00;
    public int A01;
    public ImageView.ScaleType A02;
    public Integer A03;
    public String A04;
    public String A05;
    public int[] A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public C48315LZo(String str, String str2, boolean z) {
        C14360o3.A0B(str, 1);
        this.A07 = str;
        this.A08 = str2;
        this.A09 = z;
        this.A06 = new int[0];
        this.A02 = ImageView.ScaleType.CENTER_CROP;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A07;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C48315LZo c48315LZo = (C48315LZo) obj;
        C14360o3.A0B(c48315LZo, 0);
        if (C14360o3.A0K(this.A07, c48315LZo.A07) && C14360o3.A0K(this.A08, c48315LZo.A08)) {
            return true;
        }
        return false;
    }
}
