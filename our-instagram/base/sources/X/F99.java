package X;

import com.instagram.api.schemas.PrimaryProfileLinkType;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/* loaded from: classes6.dex */
public abstract class F99 {
    public static C34649FOh parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C34649FOh c34649FOh = new C34649FOh();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                Date date = null;
                date = null;
                ArrayList arrayList = null;
                ArrayList arrayList2 = null;
                if ("pk".equals(A0s)) {
                    c34649FOh.A0G = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC31189DnY.A01().equals(A0s)) {
                    c34649FOh.A0O = AbstractC167017dG.A0m(c16l);
                } else if ("trusted_username".equals(A0s)) {
                    c34649FOh.A0N = AbstractC167017dG.A0m(c16l);
                } else if ("trust_days".equals(A0s)) {
                    c34649FOh.A01 = c16l.A1D();
                } else if ("full_name".equals(A0s)) {
                    c34649FOh.A0F = AbstractC167017dG.A0m(c16l);
                } else if ("biography".equals(A0s)) {
                    c34649FOh.A0A = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC58317Pt9.A00(690).equals(A0s)) {
                    c34649FOh.A04 = AbstractC81753kn.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(2934).equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    c34649FOh.A0R = arrayList;
                } else if (AbstractC111324zv.A00(749).equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C81863l6 parseFromJson = AbstractC81853l4.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    }
                    c34649FOh.A0Q = arrayList2;
                } else if (AbstractC43591JPw.A00(362).equals(A0s)) {
                    c34649FOh.A0E = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC31189DnY.A00().equals(A0s)) {
                    c34649FOh.A0M = AbstractC167017dG.A0m(c16l);
                } else if ("email".equals(A0s)) {
                    c34649FOh.A0D = AbstractC167017dG.A0m(c16l);
                } else if ("country_code".equals(A0s)) {
                    c34649FOh.A0B = AbstractC167017dG.A0m(c16l);
                } else if ("national_number".equals(A0s)) {
                    c34649FOh.A0H = AbstractC167017dG.A0m(c16l);
                } else if ("gender".equals(A0s)) {
                    c34649FOh.A00 = c16l.A1D();
                } else {
                    if (!"text_app_should_see_autoimported_ig_profile_picture_dialog".equals(A0s)) {
                        if ("birthday".equals(A0s)) {
                            String A1Q = c16l.A1Q();
                            if (A1Q != null) {
                                try {
                                    date = new SimpleDateFormat("yyyy-MM-dd").parse(A1Q);
                                } catch (ParseException unused) {
                                }
                            }
                            c34649FOh.A0P = date;
                        } else if ("custom_gender".equals(A0s)) {
                            c34649FOh.A0C = AbstractC167017dG.A0m(c16l);
                        } else if ("needs_email_confirm".equals(A0s)) {
                            c34649FOh.A07 = AbstractC166997dE.A0d(c16l);
                        } else if ("needs_phone_confirm".equals(A0s)) {
                            c34649FOh.A0Z = c16l.A0d();
                        } else if ("profile_pic_url".equals(A0s)) {
                            c34649FOh.A05 = AbstractC222616c.A00(c16l);
                        } else if ("page_id".equals(A0s)) {
                            c34649FOh.A0I = AbstractC167017dG.A0m(c16l);
                        } else if ("page_name".equals(A0s)) {
                            c34649FOh.A0J = AbstractC167017dG.A0m(c16l);
                        } else if ("ads_page_id".equals(A0s)) {
                            c34649FOh.A08 = AbstractC167017dG.A0m(c16l);
                        } else if (AbstractC58317Pt9.A00(670).equals(A0s)) {
                            c34649FOh.A09 = AbstractC167017dG.A0m(c16l);
                        } else if (AbstractC58317Pt9.A00(912).equals(A0s)) {
                            c34649FOh.A0K = AbstractC167017dG.A0m(c16l);
                        } else if (AbstractC58317Pt9.A00(913).equals(A0s)) {
                            c34649FOh.A0L = AbstractC167017dG.A0m(c16l);
                        } else if ("profile_edit_params".equals(A0s)) {
                            c34649FOh.A06 = F97.parseFromJson(c16l);
                        } else if (!"is_eligible_for_music_tab_settings".equals(A0s)) {
                            if (AbstractC58317Pt9.A00(132).equals(A0s)) {
                                c34649FOh.A0b = c16l.A0d();
                            } else if (AbstractC58317Pt9.A00(133).equals(A0s)) {
                                c34649FOh.A0c = c16l.A0d();
                            } else if (AbstractC58317Pt9.A00(342).equals(A0s)) {
                                PrimaryProfileLinkType primaryProfileLinkType = (PrimaryProfileLinkType) PrimaryProfileLinkType.A01.get(AbstractC167017dG.A0m(c16l));
                                if (primaryProfileLinkType == null) {
                                    primaryProfileLinkType = PrimaryProfileLinkType.A08;
                                }
                                c34649FOh.A02 = primaryProfileLinkType;
                            } else if (AbstractC111324zv.A00(4544).equals(A0s)) {
                                c34649FOh.A0V = c16l.A0d();
                            } else if (AbstractC111324zv.A00(4541).equals(A0s)) {
                                c34649FOh.A0T = c16l.A0d();
                            } else if (AbstractC111324zv.A00(4543).equals(A0s)) {
                                c34649FOh.A0U = c16l.A0d();
                            } else if (AbstractC111324zv.A00(4762).equals(A0s)) {
                                c34649FOh.A0Y = c16l.A0d();
                            } else if (AbstractC111324zv.A00(4761).equals(A0s)) {
                                c34649FOh.A0X = c16l.A0d();
                            } else if (AbstractC111324zv.A00(4760).equals(A0s)) {
                                c34649FOh.A0W = c16l.A0d();
                            } else if ("should_show_not_confirmed_birthday_button".equals(A0s)) {
                                c34649FOh.A0a = c16l.A0d();
                            } else if (AbstractC58317Pt9.A00(769).equals(A0s)) {
                                c34649FOh.A0S = c16l.A0d();
                            } else if (AbstractC58317Pt9.A00(981).equals(A0s)) {
                                c34649FOh.A03 = AbstractC128545rN.parseFromJson(c16l);
                            } else if (AbstractC111324zv.A00(5368).equals(A0s)) {
                                c34649FOh.A0d = c16l.A0d();
                            }
                        }
                    }
                    c16l.A0d();
                }
                c16l.A0z();
            }
            return c34649FOh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
