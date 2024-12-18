package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.NuF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54003NuF {
    public static C54738OFp parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C54738OFp c54738OFp = new C54738OFp();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(225).equals(A0s)) {
                    c54738OFp.A0D = c16l.A0d();
                } else if ("is_animated_photo_effect".equals(A0s)) {
                    c54738OFp.A0E = c16l.A0d();
                } else if ("is_draft".equals(A0s)) {
                    c54738OFp.A0F = c16l.A0d();
                } else if (AbstractC43591JPw.A00(1109).equals(A0s)) {
                    c54738OFp.A0G = c16l.A0d();
                } else if ("use_hands_free".equals(A0s)) {
                    c54738OFp.A0H = c16l.A0d();
                } else if ("hands_free_duration".equals(A0s)) {
                    c54738OFp.A00 = c16l.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("camera_format_type".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("gatekeeper".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("gatelogic".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                        c54738OFp.A08 = AbstractC167017dG.A0m(c16l);
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                        c54738OFp.A09 = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC111324zv.A00(1244).equals(A0s)) {
                        c54738OFp.A07 = (EnumC53281NhJ) EnumHelper.A00(c16l.A1Q(), EnumC53281NhJ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    } else if (AbstractC43591JPw.A00(779).equals(A0s)) {
                        c54738OFp.A01 = AbstractC53994Nu5.parseFromJson(c16l);
                    } else if (AbstractC58317Pt9.A00(231).equals(A0s)) {
                        c54738OFp.A02 = AbstractC53999NuB.parseFromJson(c16l);
                    } else if (AbstractC43591JPw.A00(949).equals(A0s)) {
                        c54738OFp.A03 = AbstractC47050Kr7.parseFromJson(c16l);
                    } else if ("fan_club".equals(A0s)) {
                        c54738OFp.A04 = AbstractC54000NuC.parseFromJson(c16l);
                    } else if (AbstractC43591JPw.A00(1371).equals(A0s)) {
                        c54738OFp.A05 = AbstractC54001NuD.parseFromJson(c16l);
                    } else if ("transparent_avatar_thumbnail".equals(A0s)) {
                        c54738OFp.A06 = AbstractC54002NuE.parseFromJson(c16l);
                    } else if ("disabled_camera_formats".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                EnumC223089sn enumC223089sn = (EnumC223089sn) EnumHelper.A00(c16l.A1Q(), EnumC223089sn.A02);
                                if (enumC223089sn != null) {
                                    arrayList.add(enumC223089sn);
                                }
                            }
                        }
                        c54738OFp.A0A = arrayList;
                    } else if ("effect_actions".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                EnumC53282NhK enumC53282NhK = (EnumC53282NhK) EnumHelper.A00(c16l.A1Q(), EnumC53282NhK.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                                if (enumC53282NhK != null) {
                                    arrayList.add(enumC53282NhK);
                                }
                            }
                        }
                        c54738OFp.A0B = arrayList;
                    } else if (AbstractC43591JPw.A00(956).equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                EnumC223099so enumC223099so = (EnumC223099so) EnumHelper.A00(c16l.A1Q(), EnumC223099so.A02);
                                if (enumC223099so != null) {
                                    arrayList.add(enumC223099so);
                                }
                            }
                        }
                        c54738OFp.A0C = arrayList;
                    }
                }
                c16l.A0z();
            }
            return c54738OFp;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
