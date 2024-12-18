package X;

import android.util.Base64;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.android.gms.auth.api.accounttransfer.zzo;
import com.google.android.gms.auth.api.accounttransfer.zzs;
import com.google.android.gms.auth.api.accounttransfer.zzu;
import com.google.android.gms.auth.api.accounttransfer.zzw;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.common.server.response.zan;
import java.util.AbstractList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.SaV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63007SaV {
    public static final Object A02(FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        InterfaceC65252Tgi interfaceC65252Tgi = fastJsonResponse$Field.A04;
        if (interfaceC65252Tgi != null) {
            StringToIntConverter stringToIntConverter = (StringToIntConverter) interfaceC65252Tgi;
            Object obj2 = stringToIntConverter.A01.get(AbstractC166987dD.A0H(obj));
            if (obj2 == null && stringToIntConverter.A02.containsKey("gms_unknown")) {
                return "gms_unknown";
            }
            return obj2;
        }
        return obj;
    }

    public static final void A03(FastJsonResponse$Field fastJsonResponse$Field, Object obj, StringBuilder sb) {
        String obj2;
        int i = fastJsonResponse$Field.A01;
        if (i != 11) {
            if (i == 7) {
                obj2 = "\"";
                sb.append("\"");
                sb.append(AbstractC62860SUh.A00((String) obj));
            } else {
                sb.append(obj);
                return;
            }
        } else {
            Class cls = fastJsonResponse$Field.A05;
            C3U5.A02(cls);
            obj2 = cls.cast(obj).toString();
        }
        sb.append(obj2);
    }

    public final Object A04(FastJsonResponse$Field fastJsonResponse$Field) {
        if (this instanceof zzw) {
            zzw zzwVar = (zzw) this;
            int i = fastJsonResponse$Field.A03;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return zzwVar.A02;
                        }
                        throw AbstractC31175DnJ.A0U("Unknown SafeParcelable id=", i);
                    }
                    return Integer.valueOf(zzwVar.A00);
                }
                return zzwVar.A01;
            }
            return Integer.valueOf(zzwVar.A05);
        }
        if (this instanceof zzu) {
            zzu zzuVar = (zzu) this;
            int i2 = fastJsonResponse$Field.A03;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            return zzuVar.A02;
                        }
                        throw AbstractC31175DnJ.A0U("Unknown SafeParcelable id=", i2);
                    }
                    return zzuVar.A01;
                }
                return zzuVar.A00;
            }
            return Integer.valueOf(zzuVar.A04);
        }
        if (this instanceof zzs) {
            zzs zzsVar = (zzs) this;
            int i3 = fastJsonResponse$Field.A03;
            switch (i3) {
                case 1:
                    return Integer.valueOf(zzsVar.A05);
                case 2:
                    return zzsVar.A00;
                case 3:
                    return zzsVar.A01;
                case 4:
                    return zzsVar.A02;
                case 5:
                    return zzsVar.A03;
                case 6:
                    return zzsVar.A04;
                default:
                    throw AbstractC31175DnJ.A0U("Unknown SafeParcelable id=", i3);
            }
        }
        if (this instanceof zzo) {
            zzo zzoVar = (zzo) this;
            int i4 = fastJsonResponse$Field.A03;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 4) {
                        return zzoVar.A00;
                    }
                    throw AbstractC31175DnJ.A0U("Unknown SafeParcelable id=", i4);
                }
                return zzoVar.A01;
            }
            return Integer.valueOf(zzoVar.A03);
        }
        String str = fastJsonResponse$Field.A06;
        boolean z = ((FastSafeParcelableJsonResponse) this) instanceof SafeParcelResponse;
        if (fastJsonResponse$Field.A05 != null) {
            if (z) {
                throw AbstractC166987dD.A1D("Converting to JSON does not require this method.");
            }
            try {
                return AbstractC58323PtF.A0l(this, getClass(), AnonymousClass001.A0T("get", str.substring(1), Character.toUpperCase(str.charAt(0))));
            } catch (Exception e) {
                throw AbstractC58318PtA.A0f(e);
            }
        }
        if (z) {
            throw AbstractC166987dD.A1D("Converting to JSON does not require this method.");
        }
        return null;
    }

    public final Map A05() {
        if (this instanceof SafeParcelResponse) {
            SafeParcelResponse safeParcelResponse = (SafeParcelResponse) this;
            zan zanVar = safeParcelResponse.A03;
            if (zanVar == null) {
                return null;
            }
            String str = safeParcelResponse.A04;
            C3U5.A02(str);
            return (Map) zanVar.A02.get(str);
        }
        if (this instanceof zzw) {
            return zzw.A07;
        }
        if (this instanceof zzu) {
            return zzu.A06;
        }
        if (this instanceof zzs) {
            return zzs.A06;
        }
        return zzo.A05;
    }

    public final boolean A06(FastJsonResponse$Field fastJsonResponse$Field) {
        Integer valueOf;
        java.util.Set set;
        if (this instanceof zzw) {
            valueOf = Integer.valueOf(fastJsonResponse$Field.A03);
            set = ((zzw) this).A06;
        } else if (this instanceof zzu) {
            valueOf = Integer.valueOf(fastJsonResponse$Field.A03);
            set = ((zzu) this).A05;
        } else {
            if (this instanceof zzs) {
                return true;
            }
            if (this instanceof zzo) {
                valueOf = Integer.valueOf(fastJsonResponse$Field.A03);
                set = ((zzo) this).A04;
            } else {
                if (fastJsonResponse$Field.A02 == 11) {
                    if (fastJsonResponse$Field.A09) {
                        throw AbstractC166987dD.A1D("Concrete type arrays not supported");
                    }
                    throw AbstractC166987dD.A1D("Concrete types not supported");
                }
                if (((FastSafeParcelableJsonResponse) this) instanceof SafeParcelResponse) {
                    throw AbstractC166987dD.A1D("Converting to JSON does not require this method.");
                }
                return false;
            }
        }
        return set.contains(valueOf);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0051. Please report as an issue. */
    public String toString() {
        String str;
        byte[] bArr;
        int i;
        String str2;
        Map A05 = A05();
        StringBuilder A0q = AbstractC58318PtA.A0q(100);
        Iterator A12 = AbstractC43593JPy.A12(A05);
        while (A12.hasNext()) {
            String A1B = AbstractC166987dD.A1B(A12);
            FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) A05.get(A1B);
            if (A06(fastJsonResponse$Field)) {
                Object A02 = A02(fastJsonResponse$Field, A04(fastJsonResponse$Field));
                if (A0q.length() == 0) {
                    A0q.append("{");
                } else {
                    A0q.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                }
                String str3 = "\"";
                A0q.append("\"");
                A0q.append(A1B);
                A0q.append("\":");
                if (A02 == null) {
                    str3 = "null";
                } else {
                    switch (fastJsonResponse$Field.A02) {
                        case 8:
                            A0q.append("\"");
                            bArr = (byte[]) A02;
                            if (bArr != null) {
                                i = 0;
                                str2 = Base64.encodeToString(bArr, i);
                                A0q.append(str2);
                                break;
                            }
                            str2 = null;
                            A0q.append(str2);
                        case 9:
                            A0q.append("\"");
                            bArr = (byte[]) A02;
                            if (bArr != null) {
                                i = 10;
                                str2 = Base64.encodeToString(bArr, i);
                                A0q.append(str2);
                                break;
                            }
                            str2 = null;
                            A0q.append(str2);
                        case 10:
                            S2Q.A00(A0q, (HashMap) A02);
                            break;
                        default:
                            if (fastJsonResponse$Field.A08) {
                                AbstractList abstractList = (AbstractList) A02;
                                A0q.append("[");
                                int size = abstractList.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    if (i2 > 0) {
                                        A0q.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                                    }
                                    Object obj = abstractList.get(i2);
                                    if (obj != null) {
                                        A03(fastJsonResponse$Field, obj, A0q);
                                    }
                                }
                                str3 = "]";
                                break;
                            } else {
                                A03(fastJsonResponse$Field, A02, A0q);
                                break;
                            }
                    }
                }
                A0q.append(str3);
            }
        }
        if (A0q.length() > 0) {
            str = "}";
        } else {
            str = "{}";
        }
        return AbstractC166997dE.A0x(str, A0q);
    }
}
