package X;

import java.lang.reflect.Constructor;
import java.util.List;

/* renamed from: X.Wbl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70525Wbl implements InterfaceC71905X9p {
    public final /* synthetic */ C4SS A00;
    public final /* synthetic */ C4TZ A01;

    public C70525Wbl(C4SS c4ss, C4TZ c4tz) {
        this.A01 = c4tz;
        this.A00 = c4ss;
    }

    @Override // X.InterfaceC71905X9p
    public final InterfaceC97954aa[] AMC() {
        String str;
        try {
            Constructor<?> constructor = Class.forName("com.google.android.exoplayer2.extractor.mp3.Mp3Extractor").getConstructor(new Class[0]);
            C4AN c4an = this.A00.A0K;
            List list = c4an.A0I;
            if ((list != null && list.contains("undefined")) || ((str = c4an.A0F) != null && str.equals("undefined"))) {
                return new InterfaceC97954aa[]{(InterfaceC97954aa) constructor.newInstance(new Object[0]), new C65915TwM()};
            }
            return new InterfaceC97954aa[]{(InterfaceC97954aa) constructor.newInstance(new Object[0])};
        } catch (Exception e) {
            android.util.Log.e("HeroExo2VodInitHelper", "Error while creating Mp3/Mp4 Extractor(s)", e);
            throw new RuntimeException(e);
        }
    }
}
