package X;

import com.instagram.common.notifications.push.intf.PushChannelType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5Nv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC116165Nv {
    public static C116155Nu parseFromJson(C16L c16l) {
        Integer valueOf;
        EnumC47122Ee enumC47122Ee;
        PushChannelType pushChannelType;
        boolean A0d;
        C14360o3.A0B(c16l, 0);
        try {
            C116155Nu c116155Nu = new C116155Nu();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J == c16r2) {
                    break;
                }
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                String str27 = null;
                String str28 = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                String str36 = null;
                String str37 = null;
                String str38 = null;
                String str39 = null;
                String str40 = null;
                String str41 = null;
                String str42 = null;
                String str43 = null;
                String str44 = null;
                String str45 = null;
                Boolean bool = null;
                String str46 = null;
                String str47 = null;
                String str48 = null;
                String str49 = null;
                String str50 = null;
                String str51 = null;
                String str52 = null;
                HashMap hashMap = null;
                String str53 = null;
                String str54 = null;
                String str55 = null;
                String str56 = null;
                String str57 = null;
                if ("t".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    c116155Nu.A1I = str2;
                } else if ("m".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str3 = c16l.A1P();
                    }
                    c116155Nu.A0r = str3;
                } else if ("brf".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str4 = c16l.A1P();
                    }
                    c116155Nu.A0t = str4;
                } else if ("st".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str5 = c16l.A1P();
                    }
                    c116155Nu.A1D = str5;
                } else if ("tt".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str6 = c16l.A1P();
                    }
                    c116155Nu.A1H = str6;
                } else if ("dedup".equals(A0q)) {
                    c116155Nu.A06 = AbstractC62264S4j.parseFromJson(c16l);
                } else if ("ig".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str7 = c16l.A1P();
                    }
                    c116155Nu.A0g = str7;
                } else if ("r_cc".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str8 = c16l.A1P();
                    }
                    c116155Nu.A15 = str8;
                } else if ("collapse_key".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str9 = c16l.A1P();
                    }
                    c116155Nu.A0X = str9;
                } else if ("i".equals(A0q)) {
                    c116155Nu.A0D = AbstractC222616c.A00(c16l);
                } else if ("a".equals(A0q)) {
                    c116155Nu.A0C = AbstractC222616c.A00(c16l);
                } else if ("ei".equals(A0q)) {
                    c116155Nu.A0E = AbstractC222616c.A00(c16l);
                } else if ("sound".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str10 = c16l.A1P();
                    }
                    c116155Nu.A1C = str10;
                } else if ("pi".equals(A0q)) {
                    if (c16l.A11() == C16R.A0J) {
                        str11 = c16l.A1P();
                    }
                    c116155Nu.A12 = str11;
                } else if ("pim".equals(A0q)) {
                    c116155Nu.A0A = C5f8.parseFromJson(c16l);
                } else if ("c".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str12 = c16l.A1P();
                    }
                    c116155Nu.A11 = str12;
                } else if ("ti".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str13 = c16l.A1P();
                    }
                    c116155Nu.A13 = str13;
                } else if ("u".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str14 = c16l.A1P();
                    }
                    c116155Nu.A0j = str14;
                } else if ("bc".equals(A0q)) {
                    c116155Nu.A08 = AbstractC116175Nw.parseFromJson(C16V.A00(c16l.A1P()));
                } else if ("ia".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str15 = c16l.A1P();
                    }
                    c116155Nu.A0h = str15;
                } else if ("hpa".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str16 = c16l.A1P();
                    }
                    c116155Nu.A0e = str16;
                } else if ("cc".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str17 = c16l.A1P();
                    }
                    c116155Nu.A0s = str17;
                } else if ("gid".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str18 = c16l.A1P();
                    }
                    c116155Nu.A0f = str18;
                } else if ("rid".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str19 = c16l.A1P();
                    }
                    c116155Nu.A16 = str19;
                } else if ("rtc_m".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str20 = c16l.A1P();
                    }
                    c116155Nu.A17 = str20;
                } else if ("rtc_z".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str21 = c16l.A1P();
                    }
                    c116155Nu.A18 = str21;
                } else if ("s".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str22 = c16l.A1P();
                    }
                    c116155Nu.A1A = str22;
                } else if ("sna".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str23 = c16l.A1P();
                    }
                    c116155Nu.A19 = str23;
                } else if ("shh".equals(A0q)) {
                    c116155Nu.A1U = c16l.A0d();
                } else if ("lat".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str24 = c16l.A1P();
                    }
                    c116155Nu.A0l = str24;
                } else if ("long".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str25 = c16l.A1P();
                    }
                    c116155Nu.A0n = str25;
                } else if ("loc".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str26 = c16l.A1P();
                    }
                    c116155Nu.A0m = str26;
                } else if ("device_name".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str27 = c16l.A1P();
                    }
                    c116155Nu.A0k = str27;
                } else if (AbstractC37315GcH.A00(0, 9, 89).equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str28 = c16l.A1P();
                    }
                    c116155Nu.A0o = str28;
                } else if ("time".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str29 = c16l.A1P();
                    }
                    c116155Nu.A0p = str29;
                } else if ("tf_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str30 = c16l.A1P();
                    }
                    c116155Nu.A0q = str30;
                } else if ("cf".equals(A0q)) {
                    c116155Nu.A0G = Boolean.valueOf(c16l.A0d());
                } else if ("ts".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str31 = c16l.A1P();
                    }
                    c116155Nu.A0u = str31;
                } else if ("message_type_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str32 = c16l.A1P();
                    }
                    c116155Nu.A0O = str32;
                } else if ("message_type".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str33 = c16l.A1P();
                    }
                    c116155Nu.A0N = str33;
                } else if ("payload".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str34 = c16l.A1P();
                    }
                    c116155Nu.A0P = str34;
                } else if ("wa_push_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str35 = c16l.A1P();
                    }
                    c116155Nu.A0U = str35;
                } else if ("sn".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str36 = c16l.A1P();
                    }
                    c116155Nu.A0S = str36;
                } else if ("su".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str37 = c16l.A1P();
                    }
                    c116155Nu.A0R = str37;
                } else if ("gn".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str38 = c16l.A1P();
                    }
                    c116155Nu.A0M = str38;
                } else if ("rn".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str39 = c16l.A1P();
                    }
                    c116155Nu.A0Q = str39;
                } else if ("tid".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str40 = c16l.A1P();
                    }
                    c116155Nu.A0T = str40;
                } else if ("is_thread_muted".equals(A0q)) {
                    c116155Nu.A1Q = c16l.A0d();
                } else if ("is_thread_hidden".equals(A0q)) {
                    c116155Nu.A1P = c16l.A0d();
                } else if ("is_fg".equals(A0q)) {
                    c116155Nu.A1O = c16l.A0d();
                } else if ("atid".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str41 = c16l.A1P();
                    }
                    c116155Nu.A0z = str41;
                } else if ("mtr_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str42 = c16l.A1P();
                    }
                    c116155Nu.A0x = str42;
                } else if ("exp".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str43 = c16l.A1P();
                    }
                    c116155Nu.A0c = str43;
                } else if ("tp".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str44 = c16l.A1P();
                    }
                    c116155Nu.A0a = str44;
                } else if ("t_t".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str45 = c16l.A1P();
                    }
                    c116155Nu.A0b = str45;
                } else if ("is_e2ee_badge_calculated".equals(A0q)) {
                    c116155Nu.A1R = c16l.A0d();
                } else if ("mw".equals(A0q)) {
                    C16R A112 = c16l.A11();
                    if (A112 != C16R.A0G) {
                        if (A112 == C16R.A0J) {
                            A0d = Boolean.valueOf(c16l.A1P()).booleanValue();
                        } else {
                            A0d = c16l.A0d();
                        }
                        bool = Boolean.valueOf(A0d);
                    }
                    c116155Nu.A0F = bool;
                } else if ("ntlt".equals(A0q)) {
                    c116155Nu.A0J = Long.valueOf(c16l.A0y());
                } else if ("NOTIFICATION_CREATED_TIMESTAMP".equals(A0q)) {
                    c116155Nu.A03 = c16l.A0y();
                } else if ("nf".equals(A0q)) {
                    c116155Nu.A04 = c16l.A0y();
                } else if ("jl_hash".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str46 = c16l.A1P();
                    }
                    c116155Nu.A0W = str46;
                } else if ("di_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str47 = c16l.A1P();
                    }
                    c116155Nu.A0V = str47;
                } else if ("is_instamadillo".equals(A0q)) {
                    c116155Nu.A1S = c16l.A0d();
                } else if ("itt".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str48 = c16l.A1P();
                    }
                    c116155Nu.A0i = str48;
                } else if ("thread_igid".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str49 = c16l.A1P();
                    }
                    c116155Nu.A1G = str49;
                } else if ("t_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str50 = c16l.A1P();
                    }
                    c116155Nu.A1F = str50;
                } else if ("pay_nonce".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str51 = c16l.A1P();
                    }
                    c116155Nu.A10 = str51;
                } else if ("grpid".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str52 = c16l.A1P();
                    }
                    c116155Nu.A0d = str52;
                } else if ("tkids".equals(A0q)) {
                    if (c16l.A11() == c16r) {
                        HashMap hashMap2 = new HashMap();
                        while (c16l.A1J() != c16r2) {
                            String A1P = c16l.A1P();
                            c16l.A1J();
                            if (c16l.A11() == C16R.A0G) {
                                hashMap2.put(A1P, null);
                            } else {
                                String A1P2 = c16l.A1P();
                                if (A1P2 != null) {
                                    hashMap2.put(A1P, A1P2);
                                }
                            }
                        }
                        hashMap = hashMap2;
                    }
                    c116155Nu.A1J = hashMap;
                } else if ("muid".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str53 = c16l.A1P();
                    }
                    c116155Nu.A0y = str53;
                } else if ("delivery_channel".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str54 = c16l.A1P();
                    }
                    PushChannelType[] values = PushChannelType.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            pushChannelType = values[i];
                            if (C14360o3.A0K(pushChannelType.A01, str54)) {
                                break;
                            }
                            i++;
                        } else {
                            pushChannelType = PushChannelType.A0D;
                            break;
                        }
                    }
                    c116155Nu.A0B = pushChannelType;
                } else if ("achid".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str55 = c16l.A1P();
                    }
                    EnumC47122Ee[] values2 = EnumC47122Ee.values();
                    int length2 = values2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            enumC47122Ee = values2[i2];
                            if (C14360o3.A0K(enumC47122Ee.A00, str55)) {
                                break;
                            }
                            i2++;
                        } else {
                            enumC47122Ee = EnumC47122Ee.A0c;
                            break;
                        }
                    }
                    c116155Nu.A07 = enumC47122Ee;
                } else if ("f".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str56 = c16l.A1P();
                    }
                    c116155Nu.A1E = str56;
                } else if ("ch".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str57 = c16l.A1P();
                    }
                    c116155Nu.A0Y = str57;
                } else if ("sndtm".equals(A0q)) {
                    c116155Nu.A00 = (float) c16l.A0U();
                } else if ("cdlw".equals(A0q)) {
                    c116155Nu.A01 = c16l.A1D();
                } else if ("ls".equals(A0q)) {
                    c116155Nu.A02 = c16l.A1D();
                } else if ("sort_key".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c116155Nu.A1B = str;
                } else if ("direct_metadata".equals(A0q)) {
                    c116155Nu.A05 = AbstractC46890KoX.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            String str58 = c116155Nu.A0e;
            List list = null;
            if (str58 != null) {
                C16L A03 = AbstractC221915u.A00.A03(str58);
                try {
                    if (A03.A1J() == C16R.A0C) {
                        ArrayList arrayList = new ArrayList();
                        while (A03.A1J() != C16R.A08) {
                            if (A03.A11() != C16R.A0G && (valueOf = Integer.valueOf(A03.A1D())) != null) {
                                arrayList.add(valueOf);
                            }
                        }
                        list = Collections.unmodifiableList(arrayList);
                    }
                    A03.close();
                } catch (Throwable th) {
                    try {
                        A03.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            }
            c116155Nu.A1K = list;
            return c116155Nu;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
