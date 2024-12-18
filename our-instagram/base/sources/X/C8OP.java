package X;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.assetpicker.cutout.viewmodel.CutoutStickerViewModel$loadOriginalBitmap$3;
import com.instagram.creation.capture.assetpicker.cutout.viewmodel.CutoutStickerViewModel$special$$inlined$CoroutineExceptionHandler$1;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.8OP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8OP extends C193578hc {
    public LAD A00;
    public AnonymousClass195 A01;
    public AnonymousClass195 A02;
    public AnonymousClass195 A03;
    public AnonymousClass195 A04;
    public AnonymousClass195 A05;
    public AnonymousClass195 A06;
    public C05A A07;
    public C05A A08;
    public C05A A09;
    public C05A A0A;
    public boolean A0B;
    public AnonymousClass195 A0C;
    public final Application A0D;
    public final UserSession A0E;
    public final InterfaceC09390do A0F;
    public final CoroutineExceptionHandler A0G;
    public final C05A A0H;
    public final C0UO A0I;

    public final void A0I(Bitmap bitmap, boolean z) {
        Object value;
        C8OS c8os;
        Bitmap bitmap2;
        float[] fArr;
        Object value2;
        C8OS c8os2;
        Integer num;
        C14360o3.A0B(bitmap, 0);
        C05A c05a = this.A07;
        do {
        } while (!c05a.AIi(c05a.getValue(), ""));
        C05A c05a2 = this.A0H;
        do {
            value = c05a2.getValue();
            c8os = (C8OS) value;
            bitmap2 = c8os.A00;
            fArr = c8os.A08;
        } while (!c05a2.AIi(value, new C8OS(bitmap, bitmap2, c8os.A01, c8os.A03, c8os.A04, c8os.A05, fArr, c8os.A07, c8os.A06)));
        Application application = this.A0D;
        Context applicationContext = application.getApplicationContext();
        C14360o3.A07(applicationContext);
        UserSession userSession = this.A0E;
        Context applicationContext2 = application.getApplicationContext();
        C14360o3.A07(applicationContext2);
        this.A00 = new LAD(applicationContext, bitmap, userSession, new C72768Xmk(applicationContext2, userSession), z);
        do {
            value2 = c05a2.getValue();
            c8os2 = (C8OS) value2;
            num = C05F.A00;
        } while (!c05a2.AIi(value2, new C8OS(c8os2.A02, bitmap, null, c8os2.A03, c8os2.A04, num, c8os2.A08, false, false)));
        C141796aw A00 = AbstractC141776au.A00(this);
        this.A0C = AbstractC23641Du.A03(num, AnonymousClass191.A00, new CutoutStickerViewModel$loadOriginalBitmap$3(bitmap, this, null, z), A00);
    }

    public final Bitmap A0E(C119365at c119365at, C114205Dh c114205Dh, C5YC c5yc, Integer num, boolean z) {
        Rect rect;
        LAD lad;
        float[] fArr;
        Integer num2;
        Integer num3;
        C0UO c0uo = this.A0I;
        Integer num4 = ((C8OS) c0uo.getValue()).A05;
        if (((Boolean) this.A08.getValue()).booleanValue()) {
            Bitmap bitmap = ((C8OS) c0uo.getValue()).A02;
            if (bitmap != null) {
                num2 = Integer.valueOf(bitmap.getWidth());
            } else {
                num2 = null;
            }
            Bitmap bitmap2 = ((C8OS) c0uo.getValue()).A02;
            if (bitmap2 != null) {
                num3 = Integer.valueOf(bitmap2.getHeight());
            } else {
                num3 = null;
            }
            int i = AbstractC28121CaU.A00;
            rect = null;
            if (num2 != null && num3 != null && c114205Dh != null && c119365at != null && c5yc != null) {
                float intValue = num2.intValue();
                long j = c5yc.A00;
                float A02 = intValue / C5YC.A02(j);
                float intValue2 = num3.intValue() / C5YC.A00(j);
                C114205Dh A03 = c114205Dh.A03(c119365at.A00 ^ (-9223372034707292160L));
                RectF rectF = new RectF(A03.A01 * A02, A03.A03 * intValue2, A03.A02 * A02, A03.A00 * intValue2);
                rect = new Rect();
                rectF.roundOut(rect);
            }
        } else {
            rect = null;
        }
        if (num4 == C05F.A01) {
            return AbstractC28121CaU.A00(((C8OS) c0uo.getValue()).A02, rect, num, ((C8OS) c0uo.getValue()).A08, z);
        }
        if (num4 != C05F.A0j || (lad = this.A00) == null) {
            return null;
        }
        Bitmap bitmap3 = lad.A02;
        C50627MWo c50627MWo = (C50627MWo) AbstractC001800i.A0O(lad.A04, lad.A00);
        if (c50627MWo != null) {
            fArr = (float[]) c50627MWo.A00;
        } else {
            fArr = null;
        }
        return AbstractC28121CaU.A00(bitmap3, rect, num, fArr, z);
    }

    public final Integer A0F() {
        Integer num = ((C8OS) this.A0H.getValue()).A05;
        if (num == null) {
            return null;
        }
        switch (num.intValue()) {
            case 0:
            case 1:
            case 2:
            case 6:
                return C05F.A00;
            case 3:
            case 4:
            case 5:
                return C05F.A01;
            case 7:
            case 8:
            case 9:
                return null;
            default:
                throw new RuntimeException();
        }
    }

    public final void A0G() {
        AnonymousClass195 anonymousClass195 = this.A0C;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        AnonymousClass195 anonymousClass1952 = this.A05;
        if (anonymousClass1952 != null) {
            anonymousClass1952.AGH(null);
        }
        AnonymousClass195 anonymousClass1953 = this.A01;
        if (anonymousClass1953 != null) {
            anonymousClass1953.AGH(null);
        }
        AnonymousClass195 anonymousClass1954 = this.A06;
        if (anonymousClass1954 != null) {
            anonymousClass1954.AGH(null);
        }
        AnonymousClass195 anonymousClass1955 = this.A03;
        if (anonymousClass1955 != null) {
            anonymousClass1955.AGH(null);
        }
        if (this.A0B) {
            AnonymousClass195 anonymousClass1956 = this.A02;
            if (anonymousClass1956 != null) {
                anonymousClass1956.AGH(null);
            }
            AnonymousClass195 anonymousClass1957 = this.A04;
            if (anonymousClass1957 != null) {
                anonymousClass1957.AGH(null);
            }
        }
        this.A0B = false;
        this.A08.Egh(false);
        this.A0H.Egh(new C8OS(null, null, null, null, null, null, null, false, false));
    }

    public final void A0H() {
        Object value;
        C8OS c8os;
        Integer num;
        Bitmap bitmap = ((C8OS) this.A0I.getValue()).A02;
        C05A c05a = this.A0H;
        do {
            value = c05a.getValue();
            c8os = (C8OS) value;
            num = C05F.A0N;
        } while (!c05a.AIi(value, new C8OS(c8os.A02, bitmap, null, c8os.A03, c8os.A04, num, c8os.A08, c8os.A07, c8os.A06)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8OP(Application application, UserSession userSession) {
        super(application);
        Context applicationContext = application.getApplicationContext();
        C14360o3.A07(applicationContext);
        C8OQ c8oq = new C8OQ(applicationContext, userSession);
        C14360o3.A0B(userSession, 2);
        this.A0D = application;
        this.A0E = userSession;
        this.A0F = AbstractC09440dt.A01(new C9F5(4, c8oq, new C8CY(c8oq.A00)));
        this.A09 = new C008002u(false);
        this.A0A = C10E.A00(null);
        this.A07 = new C008002u("");
        this.A08 = new C008002u(false);
        this.A0G = new CutoutStickerViewModel$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this);
        C008002u c008002u = new C008002u(new C8OS(null, null, null, null, null, null, null, false, false));
        this.A0H = c008002u;
        this.A0I = c008002u;
    }
}
