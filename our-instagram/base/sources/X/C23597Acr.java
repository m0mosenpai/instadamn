package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.facebook.react.bridge.WritableNativeMap;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.reels.smb.model.ProfileStickerAiAgentData;
import com.instagram.reels.smb.model.ProfileStickerModel;
import com.instagram.ui.widget.mediapicker.view.GalleryPickerMediaOverlayView;
import com.instagram.user.model.User;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Acr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23597Acr implements C1NJ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C23597Acr(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        String str;
        AbstractC130945vi c220839p7;
        switch (this.A00) {
            case 0:
                ((C56155OwM) this.A01).A00 = c73033Pe.A01;
                ((CountDownLatch) this.A02).countDown();
                return;
            case 1:
                Bitmap A0O = AbstractC166997dE.A0O(c73033Pe);
                if (A0O == null) {
                    return;
                }
                C44362Jj1 c44362Jj1 = (C44362Jj1) this.A02;
                Context context = (Context) this.A01;
                int i = c44362Jj1.A01;
                Bitmap A07 = C1NC.A07(A0O, i, i);
                if (A07 != null) {
                    c44362Jj1.A00 = new BitmapDrawable(context.getResources(), A07);
                }
                c44362Jj1.invalidateSelf();
                return;
            case 2:
                Bitmap A0O2 = AbstractC166997dE.A0O(c73033Pe);
                if (A0O2 == null) {
                    return;
                }
                ((C44306Jhx) this.A02).A00 = new BitmapDrawable(((Context) this.A01).getResources(), A0O2);
                return;
            case 3:
                AbstractC167007dF.A1K(interfaceC59502nt, c73033Pe);
                Object C4x = interfaceC59502nt.C4x();
                if (C4x != null) {
                    RemoteMedia remoteMedia = ((C44749JrW) this.A02).A02;
                    if (remoteMedia != null) {
                        str = remoteMedia.A06;
                    } else {
                        str = null;
                    }
                    if (!C4x.equals(str)) {
                        return;
                    }
                }
                Bitmap bitmap = c73033Pe.A01;
                C206019Ah c206019Ah = C206019Ah.A00;
                C44749JrW c44749JrW = (C44749JrW) this.A02;
                C177967vV c177967vV = c44749JrW.A08;
                C206279Bk c206279Bk = (C206279Bk) this.A01;
                if (bitmap != null) {
                    c206019Ah.A03(bitmap, c206279Bk, c177967vV, null, 0);
                } else {
                    C206019Ah.A02(c206279Bk, c177967vV);
                }
                GalleryPickerMediaOverlayView galleryPickerMediaOverlayView = c44749JrW.A07.A00;
                galleryPickerMediaOverlayView.A0B = AbstractC167007dF.A1W(bitmap);
                galleryPickerMediaOverlayView.invalidate();
                c44749JrW.A04.invalidate();
                c44749JrW.A03 = false;
                c44749JrW.A06.A05();
                return;
            case 4:
                Bitmap A0O3 = AbstractC166997dE.A0O(c73033Pe);
                boolean z = false;
                C206019Ah c206019Ah2 = C206019Ah.A00;
                C44739JrM c44739JrM = (C44739JrM) this.A02;
                C177967vV c177967vV2 = c44739JrM.A05;
                C206279Bk c206279Bk2 = (C206279Bk) this.A01;
                if (A0O3 != null) {
                    c206019Ah2.A03(A0O3, c206279Bk2, c177967vV2, null, 0);
                } else {
                    C206019Ah.A02(c206279Bk2, c177967vV2);
                }
                GalleryPickerMediaOverlayView galleryPickerMediaOverlayView2 = c44739JrM.A04.A00;
                if (A0O3 != null) {
                    z = true;
                }
                galleryPickerMediaOverlayView2.A0B = z;
                galleryPickerMediaOverlayView2.invalidate();
                c44739JrM.A03.invalidate();
                return;
            case 5:
                boolean A1R = AbstractC167007dF.A1R(0, interfaceC59502nt, c73033Pe);
                Object C4x2 = interfaceC59502nt.C4x();
                C14360o3.A0C(C4x2, "null cannot be cast to non-null type kotlin.Pair<kotlin.Int, kotlin.String>");
                C09530e4 c09530e4 = (C09530e4) C4x2;
                int A0H = AbstractC166987dD.A0H(c09530e4.A00);
                String str2 = (String) c09530e4.A01;
                Bitmap bitmap2 = c73033Pe.A01;
                if (bitmap2 != null) {
                    ((Object[]) this.A01)[A0H] = new C38687GzS(str2, bitmap2);
                }
                C218939m3 c218939m3 = (C218939m3) this.A02;
                C38687GzS[] c38687GzSArr = (C38687GzS[]) this.A01;
                int i2 = 0;
                while (c38687GzSArr[i2] != null) {
                    i2++;
                    if (i2 >= 3) {
                        ProfileStickerModel profileStickerModel = c218939m3.A01;
                        User user = profileStickerModel.A03;
                        C148276lx c148276lx = profileStickerModel.A01;
                        Integer num = profileStickerModel.A05;
                        Integer num2 = profileStickerModel.A04;
                        ProfileStickerAiAgentData profileStickerAiAgentData = profileStickerModel.A02;
                        int A06 = AbstractC167007dF.A06(A1R ? 1 : 0, c148276lx, num);
                        C14360o3.A0B(num2, 3);
                        ProfileStickerModel profileStickerModel2 = new ProfileStickerModel(c148276lx, profileStickerAiAgentData, user, num, num2);
                        profileStickerModel2.A00 = c38687GzSArr;
                        int intValue = num2.intValue();
                        if (intValue != 0) {
                            if (intValue != A1R) {
                                if (intValue == A06) {
                                    c220839p7 = new C220869pA(c218939m3.A05, c218939m3.A06, profileStickerModel2);
                                } else {
                                    throw B4Z.A00();
                                }
                            } else {
                                c220839p7 = new C220849p8(c218939m3.A05, c218939m3.A06, profileStickerModel2);
                            }
                        } else {
                            c220839p7 = new C220839p7(c218939m3.A05, profileStickerModel2);
                        }
                        c218939m3.A00 = c220839p7;
                        c218939m3.A04 = false;
                        if (!c218939m3.A03) {
                            return;
                        }
                        c218939m3.A04();
                        return;
                    }
                }
                return;
            case 6:
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                Bitmap bitmap3 = c73033Pe.A01;
                writableNativeMap.putInt(IgReactMediaPickerNativeModule.WIDTH, bitmap3.getWidth());
                writableNativeMap.putInt(IgReactMediaPickerNativeModule.HEIGHT, bitmap3.getHeight());
                ((InterfaceC65622ToD) this.A02).resolve(writableNativeMap);
                return;
            default:
                return;
        }
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        String str;
        switch (this.A00) {
            case 3:
                C14360o3.A0B(interfaceC59502nt, 0);
                C44749JrW c44749JrW = (C44749JrW) this.A02;
                c44749JrW.A03 = false;
                c44749JrW.A06.A05();
                C43888Jav c43888Jav = c44749JrW.A00;
                if (c43888Jav == null) {
                    return;
                }
                String Ba1 = interfaceC59502nt.Ba1();
                if (c82183lf != null) {
                    str = c82183lf.A02;
                } else {
                    str = null;
                }
                ((InterfaceC16620sF) c43888Jav.A01).invoke(Ba1, str);
                return;
            case 4:
            default:
                return;
            case 5:
                C218939m3.A01((C218939m3) this.A02);
                return;
            case 6:
                ((InterfaceC65622ToD) this.A02).reject(new Throwable());
                return;
        }
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }
}
