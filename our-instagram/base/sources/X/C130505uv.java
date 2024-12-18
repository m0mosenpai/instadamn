package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.forker.Process;
import com.instagram.model.keyword.KeywordRecommendations;

/* renamed from: X.5uv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130505uv {
    public EnumC130515uw A00;
    public C132765yz A01;
    public C132755yy A02;
    public C130535uy A03;
    public C132805z3 A04;
    public C132785z1 A05;
    public C132835z6 A06;
    public C132845z8 A07;
    public C132815z4 A08;
    public C132795z2 A09;
    public C38321qM A0A;
    public C38321qM A0B;
    public C47K A0C;
    public C132825z5 A0D;
    public KeywordRecommendations A0E;
    public Object A0F;
    public FOC A0G;

    public C130505uv(EnumC130515uw enumC130515uw, C130535uy c130535uy, C132835z6 c132835z6, C38321qM c38321qM) {
        this.A02 = null;
        this.A0A = null;
        this.A0C = null;
        this.A01 = null;
        this.A05 = null;
        this.A09 = null;
        this.A04 = null;
        this.A08 = null;
        this.A03 = c130535uy;
        this.A0D = null;
        this.A0B = c38321qM;
        this.A06 = c132835z6;
        this.A0E = null;
        this.A07 = null;
        this.A00 = enumC130515uw;
    }

    public final String A00() {
        C38321qM c38321qM;
        switch (this.A00.ordinal()) {
            case 1:
                c38321qM = this.A0A;
                break;
            case 2:
                C132755yy c132755yy = this.A02;
                C14360o3.A0A(c132755yy);
                return c132755yy.A01;
            case 8:
                C47K c47k = this.A0C;
                C14360o3.A0A(c47k);
                return c47k.getId();
            case Process.SIGTERM /* 15 */:
                FOC foc = this.A0G;
                C14360o3.A0A(foc);
                return foc.A04;
            case 17:
                C132785z1 c132785z1 = this.A05;
                C14360o3.A0A(c132785z1);
                String id = c132785z1.A00.getId();
                if (id != null) {
                    return id;
                }
                throw new IllegalStateException("Required value was null.");
            case 18:
                C132795z2 c132795z2 = this.A09;
                C14360o3.A0A(c132795z2);
                return c132795z2.A02;
            case 20:
                C132805z3 c132805z3 = this.A04;
                C14360o3.A0A(c132805z3);
                return c132805z3.A00;
            case 24:
                C14360o3.A0A(this.A08);
                return "map_tile_with_pins";
            case 25:
                C130535uy c130535uy = this.A03;
                C14360o3.A0A(c130535uy);
                return c130535uy.A0A;
            case 27:
                C132825z5 c132825z5 = this.A0D;
                C14360o3.A0A(c132825z5);
                return c132825z5.A07;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C132835z6 c132835z6 = this.A06;
                C14360o3.A0A(c132835z6);
                return c132835z6.A03;
            case 30:
                KeywordRecommendations keywordRecommendations = this.A0E;
                C14360o3.A0A(keywordRecommendations);
                return keywordRecommendations.A00;
            case 32:
                c38321qM = this.A0B;
                break;
            default:
                return null;
        }
        C14360o3.A0A(c38321qM);
        return c38321qM.getId();
    }

    public final void A01() {
        EnumC130515uw enumC130515uw;
        Object obj = this.A02;
        if (obj != null) {
            enumC130515uw = EnumC130515uw.A06;
        } else {
            obj = this.A0A;
            if (obj != null) {
                enumC130515uw = EnumC130515uw.A0D;
            } else {
                obj = this.A0C;
                if (obj != null) {
                    enumC130515uw = EnumC130515uw.A03;
                } else {
                    C132765yz c132765yz = this.A01;
                    if (c132765yz != null) {
                        this.A00 = EnumC130515uw.A02;
                        FOC foc = new FOC(c132765yz);
                        this.A0G = foc;
                        this.A0F = foc;
                        return;
                    }
                    obj = this.A05;
                    if (obj != null) {
                        enumC130515uw = EnumC130515uw.A0A;
                    } else {
                        obj = this.A09;
                        if (obj != null) {
                            enumC130515uw = EnumC130515uw.A0F;
                        } else {
                            obj = this.A04;
                            if (obj != null) {
                                enumC130515uw = EnumC130515uw.A08;
                            } else {
                                obj = this.A08;
                                if (obj != null) {
                                    enumC130515uw = EnumC130515uw.A0E;
                                } else {
                                    obj = this.A03;
                                    if (obj != null) {
                                        enumC130515uw = EnumC130515uw.A07;
                                    } else {
                                        obj = this.A0D;
                                        if (obj != null) {
                                            enumC130515uw = EnumC130515uw.A09;
                                        } else {
                                            obj = this.A06;
                                            if (obj != null) {
                                                enumC130515uw = EnumC130515uw.A0B;
                                            } else {
                                                obj = this.A0E;
                                                if (obj != null) {
                                                    enumC130515uw = EnumC130515uw.A0C;
                                                } else {
                                                    obj = this.A0B;
                                                    if (obj != null) {
                                                        enumC130515uw = EnumC130515uw.A04;
                                                    } else {
                                                        obj = this.A07;
                                                        if (obj != null) {
                                                            enumC130515uw = EnumC130515uw.A0G;
                                                        } else {
                                                            this.A00 = EnumC130515uw.A0H;
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.A00 = enumC130515uw;
        this.A0F = obj;
    }

    public C130505uv() {
        this(EnumC130515uw.A0H, null, null, null);
    }
}
