package X;

import java.util.Iterator;

/* renamed from: X.AFr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23085AFr {
    public static final java.util.Set A00;
    public static final java.util.Set A01;
    public static final java.util.Set A02;

    public static final boolean A00(String str, java.util.Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (AbstractC001900j.A0a(AbstractC167007dF.A0h(str), AbstractC166987dD.A1B(it), false)) {
                return true;
            }
        }
        return false;
    }

    static {
        String[] strArr = {"🕷️", "🕸️"};
        C14360o3.A0B(strArr, 0);
        A01 = AbstractC009903n.A0K(strArr);
        String[] strArr2 = new String[47];
        System.arraycopy(new String[]{"happy halloween", "halloween", "haloween", "hallowen", "have a happy halloween", "halloweekend", "all hallow’s eve", "all hallows", "halloween costume", "dia das bruxas", "jack-o-lantern", "jackolantern", "pumpkin", "pumpkin carving", "trick or treat", "trick-or-treat", "#trickortreat", "trick-or-treating", "trick or treating", "ghost", "ghosts", "vampire", "vampires", "costume", "costumes", "werewolf", "witch"}, 0, strArr2, 0, 27);
        System.arraycopy(new String[]{"zombie", "🎃", "🌕", "🧙", "🧙\u200d♀️", "☠️", "💀", "🦇", "👻", "spooky szn", "spooky season", "boo!", "scary movies", "scary movie", "skeleton", "skeletons", "horror movies", "horror movie", "jump scare", "haunted house"}, 0, strArr2, 27, 20);
        C14360o3.A0B(strArr2, 0);
        java.util.Set A0K = AbstractC009903n.A0K(strArr2);
        A02 = A0K;
        A00 = A0K;
    }
}
