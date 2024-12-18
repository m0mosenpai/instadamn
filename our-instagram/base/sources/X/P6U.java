package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.io.BufferedOutputStream;
import java.io.File;

/* loaded from: classes9.dex */
public final class P6U implements MQE {
    public final Context A00;
    public final UserSession A01;

    private final boolean A00(C47Z c47z) {
        if ((c47z.A5V || c47z.A0w()) && c47z.A33 == null) {
            UserSession userSession = this.A01;
            if ((AbstractC54884OPf.A01(c47z) && AbstractC54884OPf.A00(userSession, c47z)) || !C18U.A06(C06090Tz.A05, userSession, 36322156170520605L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.MQE
    public final Object F8t(OXD oxd, InterfaceC23621Ds interfaceC23621Ds) {
        Object A1D;
        Bitmap bitmap;
        Object A1D2;
        EnumC115415Kb enumC115415Kb;
        String A0y;
        int A07;
        File A01;
        Bitmap.CompressFormat compressFormat;
        BufferedOutputStream bufferedOutputStream;
        C47Z c47z = oxd.A0C;
        if (A00(c47z)) {
            if (A00(c47z)) {
                ShareType A0D = c47z.A0D();
                UserSession userSession = oxd.A0B;
                boolean A00 = AbstractC54086Nvk.A00(userSession, A0D, c47z.A11());
                if (c47z.A3V == null) {
                    A0y = "Cover frame error: no rendered video";
                } else {
                    UserSession userSession2 = this.A01;
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C18U.A06(c06090Tz, userSession2, 36322156170389532L)) {
                        try {
                            A1D = ALv.A00(this.A00, userSession2, c47z);
                        } catch (Throwable th) {
                            A1D = MSW.A1D(th);
                        }
                        if (A1D instanceof C09540e5) {
                            A1D = null;
                        }
                        bitmap = (Bitmap) A1D;
                    } else {
                        bitmap = ALv.A00(this.A00, userSession2, c47z);
                    }
                    if (bitmap == null) {
                        A0y = "Cover frame error: could not retrieve photo";
                    } else {
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        try {
                            AbstractC916948n.A0F();
                            A07 = AbstractC25225BEi.A07(c06090Tz, userSession2, 36609287619876737L);
                            if (A07 == 0) {
                                A07 = C55187Ods.A00(width);
                            }
                            A01 = AbstractC916948n.A01();
                            compressFormat = Bitmap.CompressFormat.JPEG;
                            bufferedOutputStream = new BufferedOutputStream(MSW.A0x(A01));
                        } catch (Throwable th2) {
                            A1D2 = MSW.A1D(th2);
                        }
                        try {
                            C0fK.A01(compressFormat, bitmap, A07);
                            boolean compress = bitmap.compress(compressFormat, A07, bufferedOutputStream);
                            bufferedOutputStream.close();
                            if (!compress) {
                                StringBuilder A1C = AbstractC166987dD.A1C();
                                A1C.append("file size ");
                                A1C.append(A01.length());
                                A1C.append(", quality ");
                                A1C.append(A07);
                                A1C.append(", format ");
                                A1C.append(compressFormat);
                                A1C.append(", file ");
                                AbstractC12120kG.A0C("bitmap_compress_error", AbstractC166997dE.A0x(A01.getCanonicalPath(), A1C), null);
                            }
                            c47z.A33 = A01.getCanonicalPath();
                            c47z.A0C = width;
                            c47z.A0B = height;
                            C25A.A00(userSession).A0A();
                            A1D2 = C0eB.A00;
                            Throwable A002 = C09550e6.A00(A1D2);
                            if (A002 != null) {
                                if (A00) {
                                    enumC115415Kb = EnumC115415Kb.A0G;
                                } else {
                                    enumC115415Kb = EnumC115415Kb.A0F;
                                }
                                A0y = AbstractC166997dE.A0y("Cover frame error: unable to compress and save bitmap: ", A002);
                                return new NRJ(oxd.A02(enumC115415Kb, A0y));
                            }
                        } finally {
                        }
                    }
                }
                if (A00) {
                    enumC115415Kb = EnumC115415Kb.A0G;
                } else {
                    enumC115415Kb = EnumC115415Kb.A0F;
                }
                return new NRJ(oxd.A02(enumC115415Kb, A0y));
            }
            return NRL.A00;
        }
        return NRK.A00;
    }

    @Override // X.MQE
    public final String getName() {
        return "RenderCoverFrame";
    }

    public P6U(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
