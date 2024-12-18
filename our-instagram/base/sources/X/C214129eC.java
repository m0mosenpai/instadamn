package X;

import android.content.Context;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import kotlin.Deprecated;

/* renamed from: X.9eC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214129eC extends AbstractC201618vq implements InterfaceC201628vr {
    public ColorFilter A00;
    public boolean A01;
    public int A02;
    public C199838sn A03;
    public final C214139eD A06;
    public final InstagramFilterFactoryProvider A05 = new Object();
    public boolean A04 = true;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider, java.lang.Object] */
    public C214129eC(Context context, boolean z) {
        this.A06 = new C214139eD(null, C198548q3.A00(context, z));
    }

    public final synchronized void A00(int i) {
        String str;
        if (i != this.A02) {
            this.A02 = i;
            if (i != 114) {
                if (i != 640) {
                    if (i != 813) {
                        if (i != 642) {
                            if (i != 643) {
                                if (i != 702) {
                                    if (i != 703) {
                                        if (i != 709) {
                                            if (i != 710) {
                                                if (i != 810) {
                                                    if (i != 811) {
                                                        switch (i) {
                                                            case 705:
                                                                str = "CinemaBlueFilter";
                                                                break;
                                                            case 706:
                                                                str = "CrystalClearFilter";
                                                                break;
                                                            case 707:
                                                                str = "VintageFilter";
                                                                break;
                                                            default:
                                                                throw AbstractC166987dD.A12(AnonymousClass001.A0c("Filter ", AbstractC43591JPw.A00(99), i));
                                                        }
                                                    } else {
                                                        str = "FastRetouchingFilter";
                                                    }
                                                } else {
                                                    str = "ParisFilter";
                                                }
                                            } else {
                                                str = "PastelSkyFilter";
                                            }
                                        } else {
                                            str = "PastelPinkFilter";
                                        }
                                    } else {
                                        str = "CinemaRedFilter";
                                    }
                                } else {
                                    str = "DramaticBlackWhiteFilter";
                                }
                            } else {
                                str = "OsloFilter";
                            }
                        } else {
                            str = "RioDeJaneiroFilter";
                        }
                    } else {
                        str = "LosAngelesFilter";
                    }
                } else {
                    str = "MelbourneFilter";
                }
            } else {
                str = "GinghamFilter";
            }
            ColorFilter colorFilter = new ColorFilter(str, false);
            this.A00 = colorFilter;
            C199838sn c199838sn = new C199838sn(this.A05, colorFilter);
            this.A03 = c199838sn;
            this.A06.A00(c199838sn, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        }
    }

    @Override // X.C81A
    public final synchronized boolean DCH(C201278vB c201278vB, long j) {
        boolean z;
        C14360o3.A0B(c201278vB, 0);
        z = false;
        try {
            z = this.A06.DCH(c201278vB, j);
        } catch (RuntimeException e) {
            if (this.A04) {
                this.A04 = false;
                C0w9.A07("IgluColorFilterRenderer render exception", e);
            }
        }
        return z;
    }

    @Override // X.C81A
    public final void Dr7(C179877yd c179877yd) {
        C14360o3.A0B(c179877yd, 0);
        this.A04 = true;
        this.A06.Dr7(c179877yd);
    }

    @Override // X.C81A
    public final void EPl(X9R x9r) {
    }

    @Override // X.InterfaceC201628vr
    public final void ESB(Integer num) {
    }

    @Override // X.C81A
    @Deprecated(message = "")
    public final boolean Ejv() {
        return false;
    }

    @Override // X.C81A
    public final Integer BIA() {
        return C05F.A00;
    }

    @Override // X.C81A
    public final void DrA() {
        this.A06.DrA();
    }

    @Override // X.C81A
    public final boolean isEnabled() {
        return this.A01;
    }
}
