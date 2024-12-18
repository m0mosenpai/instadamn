package X;

import android.content.res.Resources;
import android.os.LocaleList;

/* renamed from: X.TQm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class RunnableC64705TQm implements Runnable {
    public final /* synthetic */ EnumC72440Xdk A00;
    public final /* synthetic */ C63281Sgg A01;
    public final /* synthetic */ SGX A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ RunnableC64705TQm(EnumC72440Xdk enumC72440Xdk, C63281Sgg c63281Sgg, SGX sgx, String str) {
        this.A01 = c63281Sgg;
        this.A02 = sgx;
        this.A00 = enumC72440Xdk;
        this.A03 = str;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.SJS, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        AbstractC60708RNk abstractC60708RNk;
        String A00;
        C63281Sgg c63281Sgg = this.A01;
        SGX sgx = this.A02;
        EnumC72440Xdk enumC72440Xdk = this.A00;
        String str2 = this.A03;
        SIT sit = sgx.A02;
        sit.A02 = enumC72440Xdk;
        SJT sjt = new SIU(sit).A04;
        if (sjt == null || (str = sjt.A09) == null || str.isEmpty()) {
            str = "NA";
        }
        ?? obj = new Object();
        obj.A06 = c63281Sgg.A04;
        obj.A07 = c63281Sgg.A05;
        synchronized (C63281Sgg.class) {
            abstractC60708RNk = C63281Sgg.A0A;
            if (abstractC60708RNk == null) {
                C53082bp A002 = AbstractC61637Rr1.A00(Resources.getSystem().getConfiguration());
                C60702RNe c60702RNe = new C60702RNe();
                int i = 0;
                while (true) {
                    LocaleList localeList = ((C53092bq) A002.A00).A00;
                    if (i >= localeList.size()) {
                        break;
                    }
                    c60702RNe.A00(localeList.get(i).toLanguageTag());
                    i++;
                }
                c60702RNe.A01 = true;
                Object[] objArr = c60702RNe.A02;
                int i2 = c60702RNe.A00;
                AbstractC60714RNu abstractC60714RNu = AbstractC60708RNk.A00;
                if (i2 == 0) {
                    abstractC60708RNk = C60707RNj.A02;
                } else {
                    abstractC60708RNk = new C60707RNj(objArr, i2);
                }
                C63281Sgg.A0A = abstractC60708RNk;
            }
        }
        obj.A00 = abstractC60708RNk;
        obj.A02 = AbstractC166997dE.A0b();
        obj.A09 = str;
        obj.A08 = str2;
        C5KS c5ks = c63281Sgg.A02;
        if (c5ks.A0F()) {
            A00 = (String) c5ks.A06();
        } else {
            A00 = c63281Sgg.A03.A00();
        }
        obj.A0A = A00;
        obj.A04 = 10;
        obj.A05 = Integer.valueOf(c63281Sgg.A00);
        sgx.A00 = obj;
        c63281Sgg.A01.FFi(sgx);
    }
}
