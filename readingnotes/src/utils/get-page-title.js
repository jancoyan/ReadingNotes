import defaultSettings from '@/settings'

const title = defaultSettings.title || '读书笔记'

export default function getPageTitle(pageTitle) {
  if (pageTitle) {
    return `${pageTitle} - ${title}`
  }
  return `${title}`
}
