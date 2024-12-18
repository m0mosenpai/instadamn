package X;

import android.content.Context;
import java.util.List;

/* loaded from: classes10.dex */
public final class TRU implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ SZA A01;
    public final /* synthetic */ C63021Sam A02;
    public final /* synthetic */ C5G6 A03;
    public final /* synthetic */ Q7i A04;
    public final /* synthetic */ C61602RqR A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;

    public TRU(Context context, SZA sza, C63021Sam c63021Sam, C5G6 c5g6, Q7i q7i, C61602RqR c61602RqR, Integer num, Integer num2, String str, List list) {
        this.A01 = sza;
        this.A04 = q7i;
        this.A08 = str;
        this.A05 = c61602RqR;
        this.A09 = list;
        this.A00 = context;
        this.A02 = c63021Sam;
        this.A07 = num;
        this.A03 = c5g6;
        this.A06 = num2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SZA sza = this.A01;
        Q7i q7i = this.A04;
        String str = this.A08;
        C61602RqR c61602RqR = this.A05;
        List list = this.A09;
        sza.A01(this.A00, this.A02, this.A03, q7i, c61602RqR, this.A07, this.A06, str, list);
    }
}
