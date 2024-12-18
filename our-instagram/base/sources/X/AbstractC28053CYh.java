package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CYh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28053CYh {
    public static final String A01(EnumC46252KdU enumC46252KdU, EnumC46251KdT enumC46251KdT, UserSession userSession, String str, String str2, List list, boolean z) {
        int i;
        Object obj;
        int i2;
        String A07;
        Object[] objArr;
        Resources resources;
        int i3;
        User A00;
        Resources resources2;
        int i4;
        Object[] objArr2;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(list, 2);
        AbstractC167007dF.A1G(enumC46252KdU, 4, enumC46251KdT);
        Context A0F = AbstractC25225BEi.A0F(userSession);
        boolean equals = str.equals(userSession.userId);
        EnumC46252KdU enumC46252KdU2 = EnumC46252KdU.STORY;
        if (enumC46252KdU != enumC46252KdU2 && enumC46252KdU != EnumC46252KdU.STORY_HIGHLIGHT) {
            if (enumC46252KdU == EnumC46252KdU.CLIP) {
                if (enumC46251KdT.ordinal() != 4) {
                    return null;
                }
                if (equals) {
                    A00 = A00(str, list);
                    if (A00 == null) {
                        return null;
                    }
                    resources2 = A0F.getResources();
                    i4 = 2131959253;
                    objArr2 = new Object[]{A00.getUsername()};
                } else {
                    resources = A0F.getResources();
                    i3 = 2131959182;
                    return resources.getString(i3);
                }
            } else {
                if (enumC46252KdU == EnumC46252KdU.SOCIAL_CONTEXT) {
                    if (enumC46251KdT.ordinal() != 2) {
                        return null;
                    }
                    resources = A0F.getResources();
                    i3 = 2131959207;
                    if (equals) {
                        i3 = 2131959205;
                    }
                } else if (enumC46252KdU == EnumC46252KdU.FEED) {
                    if (enumC46251KdT.ordinal() != 4) {
                        return null;
                    }
                    if (equals) {
                        A00 = A00(str, list);
                        if (A00 == null) {
                            return null;
                        }
                        resources2 = A0F.getResources();
                        i4 = 2131959252;
                        objArr2 = new Object[]{A00.getUsername()};
                    } else {
                        resources = A0F.getResources();
                        i3 = 2131959181;
                    }
                } else if (enumC46252KdU == EnumC46252KdU.COMMENT) {
                    if (enumC46251KdT.ordinal() != 4) {
                        return null;
                    }
                    if (equals) {
                        A00 = A00(str, list);
                        if (A00 == null) {
                            return null;
                        }
                        resources2 = A0F.getResources();
                        i4 = 2131959172;
                        objArr2 = new Object[]{A00.getUsername()};
                    } else {
                        resources = A0F.getResources();
                        i3 = 2131959171;
                    }
                } else if (enumC46252KdU != EnumC46252KdU.NOTE && enumC46252KdU != EnumC46252KdU.MEDIA_NOTE) {
                    if (enumC46252KdU != EnumC46252KdU.LIVE || enumC46251KdT.ordinal() != 1) {
                        return null;
                    }
                    resources2 = A0F.getResources();
                    i4 = 2131959239;
                    objArr2 = new Object[]{str2};
                } else {
                    int ordinal = enumC46251KdT.ordinal();
                    if (ordinal != 2) {
                        if (ordinal != 4) {
                            return null;
                        }
                        if (equals) {
                            A00 = A00(str, list);
                            if (A00 == null) {
                                return null;
                            }
                            resources2 = A0F.getResources();
                            i4 = 2131959180;
                            objArr2 = new Object[]{A00.getUsername()};
                        } else {
                            resources = A0F.getResources();
                            i3 = 2131959179;
                        }
                    } else {
                        resources = A0F.getResources();
                        i3 = 2131959208;
                        if (equals) {
                            i3 = 2131959206;
                        }
                    }
                }
                return resources.getString(i3);
            }
        } else {
            int ordinal2 = enumC46251KdT.ordinal();
            if (ordinal2 != 2) {
                if (ordinal2 != 3) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 4) {
                            return null;
                        }
                        if (equals) {
                            A00 = A00(str, list);
                            if (A00 == null) {
                                return null;
                            }
                            resources2 = A0F.getResources();
                            i4 = 2131959256;
                            objArr2 = new Object[]{A00.getUsername()};
                        } else {
                            resources = A0F.getResources();
                            i3 = 2131959183;
                            return resources.getString(i3);
                        }
                    } else {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (C14360o3.A0K(((User) obj).getId(), str)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        User user = (User) obj;
                        if (enumC46252KdU == enumC46252KdU2) {
                            if (user != null && (A07 = AbstractC101904i3.A07(user)) != null) {
                                i2 = 2131960553;
                                if (z) {
                                    i2 = 2131960550;
                                    objArr = new Object[]{A07, str2};
                                }
                            } else {
                                i2 = 2131960558;
                            }
                            objArr = new Object[]{str2};
                        } else {
                            if (user != null && (A07 = AbstractC101904i3.A07(user)) != null) {
                                i2 = 2131960532;
                                if (z) {
                                    i2 = 2131960530;
                                    objArr = new Object[]{A07, str2};
                                }
                            } else {
                                i2 = 2131960536;
                            }
                            objArr = new Object[]{str2};
                        }
                        return A0F.getString(i2, objArr);
                    }
                } else if (enumC46252KdU == enumC46252KdU2) {
                    if (equals) {
                        i = 2131959259;
                    } else {
                        return AbstractC166997dE.A0r(A0F.getResources(), "", 2131960299);
                    }
                } else {
                    i = 2131960298;
                    if (equals) {
                        i = 2131960301;
                    }
                }
            } else if (enumC46252KdU == enumC46252KdU2) {
                i = 2131960316;
                if (equals) {
                    i = 2131960319;
                }
            } else {
                i = 2131960303;
                if (equals) {
                    i = 2131960306;
                }
            }
            return A0F.getString(i);
        }
        return resources2.getString(i4, objArr2);
    }

    public static final User A00(String str, List list) {
        Iterator it = list.iterator();
        User user = null;
        while (it.hasNext()) {
            User A15 = AbstractC25226BEj.A15(it);
            if (!C14360o3.A0K(A15.getId(), str)) {
                user = A15;
            }
        }
        return user;
    }
}
