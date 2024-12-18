package X;

import android.media.ThumbnailUtils;
import com.facebook.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class B5F extends AbstractC23611Dp implements InterfaceC16620sF {
    public final int A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B5F(String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A00 = i;
        this.A01 = str;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        int i;
        int i2 = this.A00;
        String str = this.A01;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            default:
                i = 2;
                break;
        }
        return new B5F(str, interfaceC23621Ds, i);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A00) {
            case 0:
                AbstractC09560e7.A00(obj);
                return ThumbnailUtils.createVideoThumbnail(this.A01, 1);
            case 1:
                AbstractC09560e7.A00(obj);
                C146106i8 c146106i8 = new C146106i8();
                c146106i8.A05();
                c146106i8.A0H = "creator_ai_improve_ai_fetch_error";
                c146106i8.A0D = this.A01;
                c146106i8.A07(R.drawable.instagram_error_pano_outline_24);
                AbstractC166997dE.A1O(C41451vu.A01, c146106i8.A00());
                return C0eB.A00;
            default:
                AbstractC09560e7.A00(obj);
                String str = this.A01;
                StringBuilder A1C = AbstractC166987dD.A1C();
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(str).getInputStream()));
                    try {
                        Iterator it = new C2Z2(new C51742Yx(bufferedReader)).iterator();
                        while (it.hasNext()) {
                            A1C.append(AbstractC166987dD.A1B(it));
                            A1C.append("\n");
                        }
                        bufferedReader.close();
                        return AbstractC166987dD.A19(A1C);
                    } finally {
                    }
                } catch (IOException unused) {
                    return MSV.A00(41);
                }
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((B5F) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
